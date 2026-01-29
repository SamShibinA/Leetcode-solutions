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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return dia;
       
    }

    public int calculateHeight(TreeNode root){
         if(root == null) return 0;
        int left=calculateHeight(root.left),right=calculateHeight(root.right);
        dia=Math.max(dia,left+right);
        return Math.max(left,right)+1;
        
    }

}