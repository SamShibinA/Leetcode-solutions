import java.util.*;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];
        
        Set<Integer> set = new HashSet<>();
        
        // Build prefix distinct counts
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            prefix[i] = set.size();
        }
        
        set.clear();
        
        // Build suffix distinct counts
        for (int i = n - 1; i >= 0; i--) {
            set.add(nums[i]);
            suffix[i] = set.size();
        }
        
        // Build answer
        for (int i = 0; i < n; i++) {
            int suf = (i + 1 < n) ? suffix[i + 1] : 0;
            ans[i] = prefix[i] - suf;
        }
        
        return ans;
    }
}
