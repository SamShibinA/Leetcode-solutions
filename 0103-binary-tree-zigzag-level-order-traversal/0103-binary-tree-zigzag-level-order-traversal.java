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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer=new ArrayList<>();
        if(root==null) return answer;
        boolean flag=false;
        Queue<TreeNode>queue=new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current_node=queue.poll();

                if(current_node.left!=null) queue.offer(current_node.left);      
                if(current_node.right!=null) queue.offer(current_node.right);

                temp.add(current_node.val);
            }
            if(flag){
                Collections.reverse(temp);
                
            }
            
            flag=!flag;

            answer.add(temp);

        }
        return answer;
    }
}