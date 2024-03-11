


def isPalindrome(x:int) -> bool:
    revint = int(str(x)[::-1])
    if (x == revint):
        return True
    else:
        return False

x = int(input())
print(isPalindrome(x))