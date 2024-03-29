# https://leetcode.com/problems/reverse-integer/
# problem link

def reverse_str(x) ->int:
    if x<0:
        result = str(x)
        return int('-'+result[:0:-1])
    else:
        result = str(x)
        return int(result[::-1])
    
    
n = int(input())
print(reverse_str(n))