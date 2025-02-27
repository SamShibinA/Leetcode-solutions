class Solution(object):
    def truncateSentence(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        sc=int(0)
        index=int(0)
        for i in range(0,len(s)):
            if s[i] in " ":
                sc+=1        
            if sc==k:
                index=i
                break
        if index==0:
            return s
        s=s[:index]
        return s
