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

    Map<String,Integer> map=new HashMap<>();
    List<TreeNode> answer=new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        serialize(root);
        return answer;
    }


    public String serialize(TreeNode root){
        if(root == null)return "#";

        String left = serialize(root.left);
        String right = serialize(root.right);

        String serial = left + "," + right + "," + root.val;

        int fre=map.getOrDefault(serial,0);

        if(fre==1){
            answer.add(root);
        }

        map.put(serial,fre+1);

        return serial;
    }
}