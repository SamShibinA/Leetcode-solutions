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
    int res=0;
    public int sumRootToLeaf(TreeNode root) {
        traverse(root,root.val);
        return res;
    }

    public void traverse(TreeNode root,int cur){
       if(root==null)return;
       if(root.left==null&&root.right==null)res+=cur;
       if(root.left!=null)traverse(root.left,cur<<1|root.left.val);
       if(root.right!=null)traverse(root.right,cur<<1|root.right.val);
    }
}