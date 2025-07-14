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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode>queue=new LinkedList<>();
            queue.add(root);
        while(!queue.isEmpty()){
            int l=queue.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode curr=queue.poll();
                temp.add(curr.val);

                if(curr.left!=null)queue.offer(curr.left);
                if(curr.right!=null)queue.offer(curr.right);
            }
            ans.add(temp);
        }
        return ans;
    }
}