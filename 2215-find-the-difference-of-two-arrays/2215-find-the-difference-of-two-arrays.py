class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        ans=[]
        lis=[]
        for num in nums1:
            if num not in nums2:
                lis.append(num)
        ans.append(list(set(lis)))
        lis=[]
        for num in nums2:
            if num not in nums1:
                lis.append(num)
        ans.append(list(set(lis)))
        return ans
