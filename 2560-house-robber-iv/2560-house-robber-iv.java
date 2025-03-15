class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 1, right = (int) 1e9;
        while (left < right) {
            int mid = left + (right - left) / 2, count = 0, prev = -2;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid && i > prev + 1) {
                    count++;
                    prev = i;
                }
            }
            if (count >= k) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
