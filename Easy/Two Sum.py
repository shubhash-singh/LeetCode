# getting from a list finding index of two number that can add upto target number
# Input: 1 2 3 4 6
#input :  10
#output : [3, 4]


class Two_Sum(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]    
        """
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                if nums[i] + nums[j] == target:
                    return i,j
            
nums = list(map(int, input("Enter the list: ").split()))
target = input("Enter the target: ")
a = Two_Sum()
print(a.twoSum(nums, target))