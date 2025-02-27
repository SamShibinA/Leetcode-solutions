class Solution(object):
    def firstPalindrome(self, words):
        """
        :type words: List[str]
        :rtype: str
        """
        ans=""
        for n in words:
            if(n==n[::-1]):
                ans=n
                break
        return ans

