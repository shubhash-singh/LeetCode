import itertools

class Solution:
    def letterCombinations(self, digits: str) -> list[str]:
        phone_number = {
            "2":["a","b","c"],
                        "3":["d","e","f"],
                        "4":["g","h","i"],
                        "5":["j","k","l"],
                        "6":["m","n","o"],
                        "7":["p","q","r","s"],
                        "8":["t","u","v"],
                        "9":["w","x","y","z"],
                        }

        if len(digits) == 0:
            return ""
        lists = []
        for i in digits:
            lists.append(phone_number[i])
        
        combos = self.get_combinations(lists)
        res = []
        for i in combos:
            res.append(''.join(map(str, i)))
        return res
    
    def get_combinations(self, lists : list[str]) -> list[tuple]:
        return list(itertools.product(*lists))
        
        
a = Solution()
print(a.letterCombinations("23"))