# https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution:
    def reverseVowels(self, s: str) -> str:
        # Convert the string to a list to modify it
        s_list = list(s)
        
        # Dictionary to store the positions of vowels in the string
        vowelDict = dict()
        vowels = 'aeiouAEIOU'
        
        # Find the positions of vowels and store them in vowelDict
        for i in range(len(s_list)):
            if s_list[i] in vowels:
                vowelDict[i] = s_list[i]

        # Get the reversed list of values (vowels)
        values = list(vowelDict.values())[::-1]

        # Create a new dictionary by assigning the reversed values to the original keys
        reversed_dict = {key: values[i] for i, key in enumerate(vowelDict.keys())}

        # Replace the vowels in the string with the reversed ones
        for i in reversed_dict.keys():
            s_list[i] = reversed_dict[i]

        # Convert the list back to a string
        return ''.join(s_list)