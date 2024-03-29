# https://leetcode.com/problems/a-number-after-a-double-reversal/description/


def isSameAfterReversals(num: int) -> bool:
        x = str(num)
        result = int(x[::-1])
        result = str(result)[::-1]
        print(result)
        if int(result) == num:
            return True
        return False
    
num = int(input())
print(isSameAfterReversals(num))