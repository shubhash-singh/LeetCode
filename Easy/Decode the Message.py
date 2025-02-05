class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        alphabet = "abcdefghijklmnopqrstuvwxyz"
        cipher_text = ""
        for ch in key:
            if ch in alphabet and ch not in cipher_text:
                cipher_text += ch
        # print(cipher_text)
        res = ""
        for ch in message:
            if ch == " ":
                res += " "
            elif ch in alphabet:
                index = cipher_text.index(ch)
                res += alphabet[index]
        return res
                
    


key = "the quick brown fox jumps over the lazy dog"
message = "vkbs bs t suepuv"
# Output: "this is a secret"

obj = Solution()
print(obj.decodeMessage(key, message))
