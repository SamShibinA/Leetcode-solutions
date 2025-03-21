class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        ans=[]
        d=0
        for i in s:
            if i=='(':
                if d>0:
                    ans.append(i)
                d+=1
            else:
                d-=1
                if d>0:
                    ans.append(i)

        return ''.join(ans)





           
            