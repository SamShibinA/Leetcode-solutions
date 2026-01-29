/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int max=Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        calculateSum(root);
        return max;
    }

    public int calculateSum(TreeNode root){
        if(root==null)return 0;
        int left_sum=calculateSum(root.left);
        int right_sum=calculateSum(root.right);
        int current_sum= left_sum + right_sum + root.val;

        max=Math.max(max,current_sum);

        return Math.max(left_sum + root.val,right_sum + root.val); 

    }
}