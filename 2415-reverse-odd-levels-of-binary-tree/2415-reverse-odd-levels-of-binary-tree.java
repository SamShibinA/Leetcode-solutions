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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null)return root;

        Queue<TreeNode> q=new LinkedList<>();

        int level=0;

        q.offer(root);

        while(!q.isEmpty()){
            int size= q.size();

            Queue<TreeNode> temp=new LinkedList<>();
            Stack<Integer> st=new Stack<>();

            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);

                if(level%2==1){
                    temp.offer(node);
                    st.push(node.val);
                }
            }

            while(!st.isEmpty()){
                TreeNode node=temp.poll();
                node.val=st.pop();
            }

            level++;

        }

        return root;
    }
}