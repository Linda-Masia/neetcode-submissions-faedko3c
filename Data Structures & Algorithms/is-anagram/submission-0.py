class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        length = len(s)
        if length != len(t):
            return False

        return sorted(s) == sorted(t)