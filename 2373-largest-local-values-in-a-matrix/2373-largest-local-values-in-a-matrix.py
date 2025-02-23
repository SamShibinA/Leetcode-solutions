class Solution(object):
    def largestLocal(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: List[List[int]]
        """
        n=len(grid)

        result=[0]*(n-2)
        for i in range(0,n-2):
            result[i]=[0]*(n-2)

        for i in range(0,n-2):
            for j in range(0,n-2):
                cmax=0
                for k in range(0,3):
                    for l in range(0,3):
                        if grid[k+i][l+j]>cmax:
                            cmax=grid[k+i][l+j]
                result[i][j]=cmax
        return result
        