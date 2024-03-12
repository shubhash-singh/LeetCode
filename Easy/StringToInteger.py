def StringToInteger(s:str) -> int:
    try:
        result = int(s.strip().split()[0])
        if result < -2147483648:
            return -2147483648
        elif result > 2147483647:
            return 2147483647
        else : return result
    except ValueError:
        result = 10

s = input()
print(StringToInteger(s))
        