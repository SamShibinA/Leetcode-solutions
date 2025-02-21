class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        ans=0
        for num in nums:
            if nums.count(num)<2:
                ans+=num
        return ans