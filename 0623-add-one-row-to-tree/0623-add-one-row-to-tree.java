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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        Queue<TreeNode> q=new LinkedList<>();

        int cd=1;

        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            if(cd==depth-1){
                for(int i=0;i<size;i++){
                    
                    TreeNode node=q.poll();

                    TreeNode left=node.left;
                    TreeNode right=node.right;

                    node.left = new TreeNode(val);
                    node.right = new TreeNode(val);

                    node.left.left=left;
                    node.right.right=right;
                }

            }
            else{
                for(int i=0;i<size;i++){
                    
                    TreeNode node=q.poll();

                    if(node.left!=null)q.offer(node.left);
                    if(node.right!=null)q.offer(node.right);
                }
            }
            cd++;
        }
        return root;
    }
}