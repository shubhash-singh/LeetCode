# https://leetcode.com/problems/merge-sorted-array/

class Solution:
    def merge(self, nums1: list, m: int, nums2: list, n: int) -> None:
        
        for i in nums2:
            nums1[m] = i
            m+=1
        nums1.sort()
        print(nums1)
        
a = Solution()
l1 = list(map(int, input().split()))
m = int(input())
l2 = list(map(int, input().split()))
n = int(input())
a.merge(l1,m,l2,n)