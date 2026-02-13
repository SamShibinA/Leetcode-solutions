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
    TreeNode end=null;
    public void flatten(TreeNode root) {
        if(root==null || root.left==null && root.right==null)return;

        flatten(root.left);
        flatten(root.right);
        if(root.left!=null){

        TreeNode temp=root.right;

        root.right=root.left;

        root.left=null;

        end=findEnd(root.right);
        
        end.right=temp;

        end=findEnd(end);
        }

        


        
    }

    public TreeNode findEnd(TreeNode root){
        while(root!=null && root.right!=null)root=root.right;
        return root;
    }
}