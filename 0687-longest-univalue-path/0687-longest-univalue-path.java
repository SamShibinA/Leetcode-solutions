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
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max==0?max:max-1;
    }

    public int[] dfs(TreeNode root){
        if(root==null)return new int[2];

        int[] left=dfs(root.left);

        int[] right=dfs(root.right);
        

        if(left[0]==root.val && right[0]==root.val){
            int through=left[1]+right[1]+1;
            max=Math.max(max,through);

            int extend=Math.max(left[1],right[1])+1;

            return new int[]{root.val,extend};
        }
        else if(left[0]==root.val){
            int fre=left[1]+1;
            max=Math.max(max,fre);
            return new int[]{root.val,fre};
        }
        else if(right[0]==root.val){
            int fre=right[1]+1;
            max=Math.max(max,fre);
            return new int[]{root.val,fre};
        }
        return new int[]{root.val,1};
    }
}