class Solution(object):
    def cellsInRange(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        ans=[]
        sv,sn,ev,en=ord(s[0]),ord(s[1]),ord(s[3]),ord(s[4])
        for i in range(sv,ev+1):
            for j in range(sn,en+1):
                ans.append(chr(i)+chr(j))
        
        return ans