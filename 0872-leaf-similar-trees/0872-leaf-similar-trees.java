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
    List<Integer> val=new ArrayList<>();
    int idx=0;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null)return true;
        add(root1);
        return check(root2) && idx==val.size();
        
    }

    public void add(TreeNode root){
        if(root==null)return;
        if(root.left==null&&root.right==null)val.add(root.val);
        add(root.left);
        add(root.right);
    }

    public boolean check(TreeNode root){
        if(root==null)return true;

        if(root.left==null&&root.right==null){
         if(idx>=val.size()||val.get(idx++)!=root.val)
          return false;
        }

        return check(root.left)&&check(root.right);

    }
}