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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();

        Queue<TreeNode> queue=new LinkedList<>();

        if(root==null)return ans;

        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();

            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                sum+=temp.val;
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);
            }
            ans.add(sum/size);
        }
        return ans;
    }
}