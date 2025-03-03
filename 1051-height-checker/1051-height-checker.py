class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        res=0
        lis=list(heights)
        lis.sort()
        for i in range(len(heights)):
            if(lis[i]!=heights[i]):
                res+=1
        return res
