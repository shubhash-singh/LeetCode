class Solution:
    def binary_search(arr, target):
    
        left, right = 0, len(arr) - 1

        while left <= right:
            mid = (left + right) // 2
            if arr[mid] == target:
                return True
            elif arr[mid] < target:
                left = mid + 1
            else:
                right = mid - 1

        return False

    def getCommon(self, nums1: list[int], nums2: list[int]) -> int:
        start = 0
        end = len(nums1) - 1
        
        while(end>start):
            mid = start + (end-start) // 2
            
            if nums1[mid] in nums2:
                return nums1[mid]
            elif()
            
        return -1