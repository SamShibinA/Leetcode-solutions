/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode,TreeNode> map=new HashMap<>();
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> answer=new ArrayList<>();

        if(root==null)return answer;

        addparent(root);

        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> visited=new HashSet<>();

        q.offer(target);
        visited.add(target);

        int distance=0;

        while(!q.isEmpty()){
            int size=q.size();

            if(distance==k)break;

            for(int i=0;i<size;i++){
                TreeNode node=q.poll();

                if(node.left!=null && !visited.contains(node.left)){
                    visited.add(node.left);
                    q.offer(node.left);
                }

                if(node.right!=null && !visited.contains(node.right)){
                    visited.add(node.right);
                    q.offer(node.right);
                }

                if(map.get(node)!=null && !visited.contains(map.get(node))){
                    visited.add(map.get(node));
                    q.offer(map.get(node));
                }
            }
            distance++;
        }


        while(!q.isEmpty()){
            answer.add(q.poll().val);
        }

        return answer;



    }

    public void addparent(TreeNode root){
        if(root==null) return;

        if(root.left!=null){
            map.put(root.left,root);
        }

        if(root.right!=null){
            map.put(root.right,root);
        }

        addparent(root.left);
        addparent(root.right);
    }
}