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
    int pre=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)map.put(inorder[i],i);
        return helper(preorder,map,0,inorder.length-1);
    }

    public TreeNode helper(int[] preorder,Map<Integer,Integer> map,int s,int e){
        if(s>e)return null;

        int root_val=preorder[pre++];

        TreeNode root=new TreeNode(root_val);

        int idx=map.get(root_val);

        root.left=helper(preorder,map,s,idx-1);
        root.right=helper(preorder,map,idx+1,e);

        return root;
    }
}