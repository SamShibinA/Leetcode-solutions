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
    int max=0;

    public int maxAncestorDiff(TreeNode root) {
        List<Integer> num=new ArrayList<>();
        num.add(root.val);
        dfs(root,num);
        return max;
    }

    public void dfs(TreeNode root,List<Integer> num){
        if(root==null)return;

        int val=root.val;

        for(int n:num){
            max=Math.max(max,Math.abs(n-val));
        }

        num.add(val);
        dfs(root.left,num);
        dfs(root.right,num);
        num.remove(num.size()-1);

    }
}