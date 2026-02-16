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

    public int sumEvenGrandparent(TreeNode root) {
        calculate(root,false,false);
        return sum;
    }

    public void calculate(TreeNode root,boolean is_parent_even,boolean is_grand_parent_even){
        if(root==null)return;

        if(is_grand_parent_even)sum+=root.val;

        calculate(root.left,root.val%2==0,is_parent_even);

        calculate(root.right,root.val%2==0,is_parent_even);
    }
}