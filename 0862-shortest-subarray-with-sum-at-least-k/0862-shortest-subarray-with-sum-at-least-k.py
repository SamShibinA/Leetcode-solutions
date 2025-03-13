
class Solution:
    def shortestSubarray(self, nums: List[int], k: int) -> int:
        prefix_sums = [0]
        for num in nums:
            prefix_sums.append(prefix_sums[-1] + num)
        
        dq = deque()
        min_length = float('inf')
        
        for i, current_sum in enumerate(prefix_sums):
            while dq and current_sum - prefix_sums[dq[0]] >= k:
                min_length = min(min_length, i - dq.popleft())
            
            while dq and current_sum <= prefix_sums[dq[-1]]:
                dq.pop()
            
            dq.append(i)
        
        return min_length if min_length != float('inf') else -1
