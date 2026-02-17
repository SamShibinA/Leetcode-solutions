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
    class Pair{
        TreeNode node;
        int max;
        Pair(TreeNode root,int m){
            node=root;
            max=m;
        }
    }

    public int goodNodes(TreeNode root) {
        int count=0;

        Queue<Pair> q=new LinkedList<>();

        if(root!=null)q.offer(new Pair(root,root.val));

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                Pair temp=q.poll();

                if(temp.node.val>=temp.max){
                    temp.max=temp.node.val;
                    count++;
                }

                if(temp.node.left!=null) q.offer(new Pair(temp.node.left,temp.max));
                if(temp.node.right!=null) q.offer(new Pair(temp.node.right,temp.max));
            }

        }
        return count;
    }
}