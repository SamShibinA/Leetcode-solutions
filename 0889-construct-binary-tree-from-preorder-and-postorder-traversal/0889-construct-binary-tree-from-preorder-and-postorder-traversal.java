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
    int preind=0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<postorder.length;i++)map.put(postorder[i],i);
        return help(preorder,map,0,postorder.length-1);
    }

    TreeNode help(int[] preorder,Map<Integer,Integer> map,int s,int e){
        if(preind>=preorder.length||s>e)return null;

        int rootval=preorder[preind++];

        TreeNode root=new TreeNode(rootval);
        
        if(s==e)return root;

        int postind=map.get(preorder[preind]);

        root.left=help(preorder,map,s,postind);
        root.right=help(preorder,map,postind+1,e-1);

        return root;

    }
}