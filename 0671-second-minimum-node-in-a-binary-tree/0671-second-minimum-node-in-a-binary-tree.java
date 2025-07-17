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
    
    public int findSecondMinimumValue(TreeNode root) {
        return secondmin(root,root.val);
    }


    public int secondmin(TreeNode root,int min){
        if(root==null)return -1;
        if(root.val>min)return root.val;
        int l=secondmin(root.left,min);
        int r=secondmin(root.right,min);
        if(l!=-1&&r!=-1)return Math.min(l,r);
        return l!=-1?l:r;
    }
}