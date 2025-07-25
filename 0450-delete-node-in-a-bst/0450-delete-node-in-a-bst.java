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

    public TreeNode findmin(TreeNode root){
        if(root==null)return root;

        while(root.left!=null)root=root.left;

        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return root;

        if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else{
            if(root.left==null&&root.right==null)return null;
            else if(root.left==null)return root.right;
            else if(root.right==null)return root.left;
            else{
                TreeNode min=findmin(root.right);
                root.val=min.val;
                root.right=deleteNode(root.right,min.val);
            }
        }
        return root;
    }
}