class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        avg=[]
        while nums:
            if len(nums)!=0:
                avg.append((max(nums)+min(nums))/2)
            nums.remove(max(nums))
            nums.remove(min(nums))
        return min(avg)
