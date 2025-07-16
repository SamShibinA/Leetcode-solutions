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
    int postind;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postind=postorder.length-1;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<=postind;i++){
            map.put(inorder[i],i);
        }
        return helper(postorder,map,0,postind);
    
    }

    TreeNode helper(int[] postorder,Map<Integer,Integer>map,int s,int e){
        if(s>e)return null;

        int rootval=postorder[postind--];

        TreeNode root=new TreeNode(rootval);

        int inind=map.get(rootval);

        root.right=helper(postorder,map,inind+1,e);
        root.left=helper(postorder,map,s,inind-1);
        return root;
    }
}