class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        nums.sort()
        return nums[0]*nums[1]*nums[-1] if nums[0]*nums[1]*nums[-1] > nums[-3]*nums[-2]*nums[-1] else  nums[-3]*nums[-2]*nums[-1]