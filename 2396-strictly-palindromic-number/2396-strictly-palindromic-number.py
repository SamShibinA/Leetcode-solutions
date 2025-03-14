class Solution:
    def isStrictlyPalindromic(self, n: int) -> bool:
        for i in range(2,n-1):
            if self.ispalin(n,i):
                return False
        return True

    def ispalin(self,n:int,base:int):
        value=[]
        while n>=1:
            value.append(n%base)
            n//=base  
            return value==value[::-1]



