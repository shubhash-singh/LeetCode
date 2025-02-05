from collections import defaultdict
import bisect

class TimeMap:
    
    def __init__(self):
        self.res = defaultdict(list)  # Dictionary storing key -> [(timestamp, value)]

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.res[key].append((timestamp, value))  # Store (timestamp, value) pair

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.res:
            return ""  # Return empty string if key does not exist
        
        arr = self.res[key]
        i = bisect.bisect_right(arr, (timestamp, chr(127))) - 1  # Binary search for latest timestamp <= given timestamp
        
        return arr[i][1] if i >= 0 else ""  # Return value if found, else empty string

# Example Usage:
# obj = TimeMap()
# obj.set("foo", "bar", 1)
# print(obj.get("foo", 1))  # Output: "bar"
# print(obj.get("foo", 3))  # Output: "bar" (closest timestamp ≤ 3)
