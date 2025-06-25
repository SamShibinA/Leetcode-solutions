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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        traverse(ans,root);
        return ans;
    }

    public static void traverse(List<Integer> ans,TreeNode root){
        if(root==null) return;
        traverse(ans,root.left);
        traverse(ans,root.right);
        ans.add(root.val);
    } 


}