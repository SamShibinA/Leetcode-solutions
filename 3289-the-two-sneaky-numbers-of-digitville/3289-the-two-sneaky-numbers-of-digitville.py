class Solution(object):
    def getSneakyNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ans=[]
        t=set(nums)

        for num in t:
            if nums.count(num)>1:
                ans.append(num)
        
        return ans