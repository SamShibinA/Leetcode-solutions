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
    TreeNode xpre=null,ypre=null;
    public boolean isCousins(TreeNode root, int x, int y) {
        traverse(root,x,y);
        return ((xpre!=ypre)&&(depth(root,x,0)==depth(root,y,0)));
    }

    public void traverse(TreeNode root,int x,int y){
        if(root==null||xpre!=null&&ypre!=null) return ;


        if(xpre==null&&(root.left!=null&&root.left.val==x||root.right!=null&&root.right.val==x)){
            xpre=root;
        }

        if(ypre==null&&(root.left!=null&&root.left.val==y||root.right!=null&&root.right.val==y)){
            ypre=root;
        }

        traverse(root.left,x,y);

        traverse(root.right,x,y);    
    }

    public int depth(TreeNode root,int val,int d){
        if(root==null)return -1;
        if(root.val==val)return d;

        int ld=depth(root.left,val,d+1);
        if(ld!=-1)return ld;

        return depth(root.left,val,d+1);
    }
}