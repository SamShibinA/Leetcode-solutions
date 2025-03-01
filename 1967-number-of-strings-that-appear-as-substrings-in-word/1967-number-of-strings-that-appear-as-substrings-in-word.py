class Solution:
    def numOfStrings(self, patterns: List[str], word: str) -> int:
        res=0

        for letter in patterns:
            if letter in word:
                res+=1
        
        return res
