class Solution(object):
    def numberGame(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        nums.sort()
        alice=int()
        bob=int()
        for i in range(0,(len(nums)/2)):
            alice=nums[0]
            bob=nums[1]
            nums=nums[2:]
            nums.append(bob)
            nums.append(alice)
        return nums 