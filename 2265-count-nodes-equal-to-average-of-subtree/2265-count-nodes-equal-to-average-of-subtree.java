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
    int ans=0;

    public int averageOfSubtree(TreeNode root) {
        traverse(root);
        return ans;
    }


    public int[] traverse(TreeNode root){
        if(root==null)return new int[]{0,0};

        int[] left=traverse(root.left);
        int[] right=traverse(root.right);

        int n=left[1]+right[1]+1;
        int tot=left[0]+right[0]+root.val;

        if(tot/n==root.val)ans++;

        return new int[]{tot,n};
    }
}