class Solution(object):
    def countPoints(self, rings):
        """
        :type rings: str
        :rtype: int
        """
        r=[0]*10
        g=[0]*10
        b=[0]*10
        
        for i in range(0,len(rings),2):
            if(rings[i]=="B"):
                b[int(rings[i+1])]+=1
            if(rings[i]=="R"):
                r[int(rings[i+1])]+=1
            if(rings[i]=="G"):
                g[int(rings[i+1])]+=1
            i+=1
        
        c=0
        
        for i in range(10):
            if b[i] and g[i] and r[i] :
                c+=1
        
        return c
            

        