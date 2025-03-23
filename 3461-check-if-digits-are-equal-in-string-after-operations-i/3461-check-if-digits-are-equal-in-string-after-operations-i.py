class Solution(object):
    def hasSameDigits(self, s):
        """
        :type s: str
        :rtype: bool
        """
        while not self.ispalin(s) and len(s)>2:
            temp=""
            for i in range(1,len(s)):
                temp+=str((int(s[i-1])+int(s[i]))%10)
            s=temp
            
        return self.ispalin(s)

    def ispalin(self,s):
        return s==s[::-1]
