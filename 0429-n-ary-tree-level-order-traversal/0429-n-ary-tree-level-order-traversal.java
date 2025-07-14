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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;

        Queue<Node> queue=new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            int l=queue.size();
            List<Integer> tem = new ArrayList<>();

            for(int i=0;i<l;i++){
                Node curr=queue.poll();
                tem.add(curr.val);
                for(Node child:curr.children){
                    if(child!=null){
                        queue.add(child);
                    }
                }

            }
            ans.add(tem);

        }
        return ans;
    }
}