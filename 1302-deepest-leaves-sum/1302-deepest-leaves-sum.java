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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)return 0;

        Queue<TreeNode> q=new LinkedList<>();

        int sum=0;

        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();

            int tsum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();

                tsum+=node.val;
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);

            }

            sum=tsum;
        }

        return sum;
    }
}