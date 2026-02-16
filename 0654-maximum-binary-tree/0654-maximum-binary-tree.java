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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }

    public TreeNode construct(int[] nums,int s,int e){
        if(s>e)return null;

        int idx=s;

        for(int i=s;i<=e;i++){
            if(nums[idx] < nums[i]){
                idx=i;
            }
        }

        TreeNode root=new TreeNode(nums[idx]);

        root.left=construct(nums,s,idx-1);
        root.right=construct(nums,idx+1,e);
       
        return root;
    }
}