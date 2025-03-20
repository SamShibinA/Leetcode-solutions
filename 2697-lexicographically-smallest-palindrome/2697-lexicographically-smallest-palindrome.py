class Solution(object):
    def makeSmallestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        s=list(s)
        t=s[::-1]

        for i in range(len(s)):
            if t[i]!=s[i] :
                if t[i] < s[i]:
                    s[i]=t[i]
                
        
        return ''.join(s)
        