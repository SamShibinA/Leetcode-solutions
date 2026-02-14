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
    int max=0;

    public int maxProduct(TreeNode root) {
        findmax(root,find_sum(root));
        return max;
    }

    public int findmax(TreeNode root,int sum){
        if(root==null)return 0;

        int left=findmax(root.left,sum);

        int right=findmax(root.right,sum);

        int tot=root.val+left+right;

        int diff=sum-tot;

        max=Math.max(max,tot * diff);

        return tot;

    }

    public int find_sum(TreeNode root){
        if(root==null) return 0;
        return root.val + find_sum(root.left) + find_sum(root.right);
    }
}