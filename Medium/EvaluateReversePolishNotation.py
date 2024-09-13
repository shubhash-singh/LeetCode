# https://leetcode.com/problems/evaluate-reverse-polish-notation/
from inspect import stack


class EvaluateReversePolishNotation:
    def evalRPN(self, tokens: list[str]) -> int:
        for token in tokens:
            if token not in {"+", "-", "*", "/"}:
                # It's a number, push it to the stack
                stack.append(int(token))
            else:
                # It's an operator, pop two numbers from the stack
                num2 = stack.pop()
                num1 = stack.pop()
                
                # Perform the operation and push the result back to the stack
                if token == "+":
                    stack.append(num1 + num2)
                elif token == "-":
                    stack.append(num1 - num2)
                elif token == "*":
                    stack.append(num1 * num2)
                elif token == "/":
                    # Integer division with truncation toward zero
                    stack.append(int(num1 / num2))
        
        # The final result will be the only element left in the stack
        return stack[0]

a = EvaluateReversePolishNotation()
print(a.evalRPN(["2","1","+","3","*"]))