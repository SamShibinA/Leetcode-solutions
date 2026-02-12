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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null)return sum;
        calculate(root,root.val);
        return sum;
    }

    public void calculate(TreeNode root,int current){
        if(root==null)return;
        if(root.left==null && root.right==null && current <= Integer.MAX_VALUE)sum+=current;
        if(root.left!=null)calculate(root.left,current*10 +root.left.val);
        if(root.right!=null)calculate(root.right,current*10 +root.right.val);


        
    }
}