class Solution:
    def averageWaitingTime(self, customers : list[list[int]]) -> float:
        current_time = 0
        total_waiting_time = 0

        for arrival, time_needed in customers:
            if current_time < arrival:
                current_time = arrival
            current_time += time_needed
            total_waiting_time += current_time - arrival

        average_waiting_time = total_waiting_time / len(customers)
        return average_waiting_time

        
        
obj = Solution()
print(obj.averageWaitingTime([[5,2],[5,4],[10,3],[20,1]]))