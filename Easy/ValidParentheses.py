# https://leetcode.com/problems/valid-parentheses/

class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for c in s:
            if c in '({[':
                stack.append(c)
            else:
                if not stack:
                    return False
                top = stack.pop()
                if (c == ')' and top != '(') or (c == '}' and top != '{') or (c == ']' and top != '['):
                    return False
        return not stack