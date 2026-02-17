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
    public int minimumOperations(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        int swaps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                arr[i] = node.val;
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            swaps += find_swaps(arr);
        }

        return swaps;
    }

    public int find_swaps(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        int[][] num = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            num[i][0] = arr[i];
            num[i][1] = i;
        }

        Arrays.sort(num, (a, b) -> a[0] - b[0]);

        int swaps = 0;

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] || num[i][1] == i)
                continue;

            int j = i;

            int cycle = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = num[j][1];
                cycle++;
            }

            swaps += (cycle - 1);
        }

        return swaps;
    }
}