/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int idx;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        traverseSerialize(root,sb);
        return sb.toString();
    }

    public void traverseSerialize(TreeNode root,StringBuilder sb){
            if(sb.length()>0) sb.append(",");
            if(root==null){
                sb.append("null");
                return;
            }

            sb.append(root.val);
            traverseSerialize(root.left,sb);
            traverseSerialize(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes=data.split(",");

        idx=0;

       return traverseDeserialize(nodes);  
    }


        public TreeNode traverseDeserialize(String[] nodes){
            if(idx>=nodes.length)return null;
            
            if(nodes[idx].equals("null")){
                idx++;
                return null;

            }

            TreeNode root = new TreeNode(Integer.valueOf(nodes[idx++]));

            root.left=traverseDeserialize(nodes);
            root.right=traverseDeserialize(nodes);

            return root;
        } 
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));