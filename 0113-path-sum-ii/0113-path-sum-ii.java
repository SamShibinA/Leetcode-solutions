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
    List<List<Integer>> answer;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        answer=new ArrayList<>();
        if(root==null)return answer;
        List<Integer> current=new ArrayList<>();
        current.add(root.val);
        traverse(root,current,targetSum,root.val);
        current.remove(0);
        return answer;
    }

    public void traverse(TreeNode root,List<Integer> current,int targetSum,int currentSum){
        if(root==null)return;

        if(root.left==null && root.right==null && currentSum==targetSum){
            answer.add(new ArrayList<>(current));
            return;
        }

        if(root.left!=null){
        current.add(root.left.val);
        traverse(root.left,current,targetSum,currentSum+root.left.val);
        current.remove(current.size()-1);
        }

        if(root.right!=null){
        current.add(root.right.val);
        traverse(root.right,current,targetSum,currentSum+root.right.val);
        current.remove(current.size()-1);
        }
            

    }
}