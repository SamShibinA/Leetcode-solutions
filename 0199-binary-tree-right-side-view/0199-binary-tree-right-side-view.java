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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            
            TreeNode current=null;
            for(int i=0;i<size;i++){
             current=queue.poll();

             if(current.left!=null)queue.offer(current.left);
             if(current.right!=null)queue.offer(current.right);   
            }
            ans.add(current.val);

        }

        return ans;

    
    }
}