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

        Queue<TreeNode> queue=new LinkedList<>();

        List<Integer> answer=new ArrayList<>();
        if(root!=null)queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();

            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                if(i==size-1)answer.add(temp.val);
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);
            }
        
        }

        return answer;

    }
}