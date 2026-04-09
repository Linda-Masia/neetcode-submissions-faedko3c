class Solution:
    def encode(self, strs: list[str]) -> str:
        result = ""
        for w in strs:
            result += str(len(w)) + "#" + w
        return result 

    def decode(self, s: str) -> list[str]:
        result, i = [], 0
        
        while i < len(s):

            j = i
            while s[j] != "#":
                j += 1
            
            length = int(s[i:j])
            
            word = s[j + 1 : j + 1 + length]
            result.append(word)
            
            i = j + 1 + length
            
        return result

