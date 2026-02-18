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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        dfs(ans,1,root);
        return ans;

    }

    public void dfs(List<Integer> ans,int depth,TreeNode root){
        if(root==null) return;

        if(depth>ans.size()){
            ans.add(root.val);
        }
        else if(ans.get(depth-1)<root.val){
            ans.set(depth-1,root.val);
        }
        dfs(ans,depth+1,root.left);
        dfs(ans,depth+1,root.right);

    }

}