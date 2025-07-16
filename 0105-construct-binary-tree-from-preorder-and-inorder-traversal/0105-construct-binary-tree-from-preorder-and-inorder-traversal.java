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
    int preind=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,inorder.length-1);
    }

    public TreeNode helper(int[] preorder,int[] inorder,int s,int e){
        if(s>e)return null;

        int rootval=preorder[preind++];

        TreeNode root=new TreeNode(rootval);

        int inind=0;

        for(int i=s;i<=e;i++){
            if(rootval==inorder[i]){
                inind=i;
                break;
            }
        }
        
        root.left=helper(preorder,inorder,s,inind-1);
        root.right=helper(preorder,inorder,inind+1,e);

       return root;
    }
}