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
    public TreeNode trimBST(TreeNode root, int low, int high) {
          if(root==null)return null;

            root.left=trimBST(root.left,low,high);
            root.right=trimBST(root.right,low,high);

          if(root.val>high||root.val<low){
            root=delete(root,root.val);
          }

          
          return root;
        
    }


    public TreeNode delete(TreeNode root,int val){
        if(root.val>val)root.left=delete(root.left,val);
        else if(root.val<val)root.right=delete(root.right,val);
        else{
            if(root.left==null&&root.right==null)return null;
            else if(root.left==null)return root.right;
            else if(root.right==null)return root.left;
            else{
                TreeNode min=findMin(root.right);
                root.val=min.val;
                root.right=delete(root.right,min.val);
            }
        }

        return root;
    }


    public TreeNode findMin(TreeNode root){
        if(root==null)return null;

        while(root.left!=null){
            root=root.left;

        }

        return root;
    }
}