class Solution(object):
    def decompressRLElist(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        decom=[]
        for i in range (0,len(nums),2):
            freq,num=nums[i],nums[i+1]
            decom.extend([num]*freq)
        return decom