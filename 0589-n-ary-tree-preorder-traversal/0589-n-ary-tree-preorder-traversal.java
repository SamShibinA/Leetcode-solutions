/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        traverse(ans,root);
        return ans;
    }

    public void traverse(List<Integer> ans,Node root){
        if(root==null) return ;
        ans.add(root.val);
        for(Node child:root.children){
            traverse(ans,child);
        }
    }
}