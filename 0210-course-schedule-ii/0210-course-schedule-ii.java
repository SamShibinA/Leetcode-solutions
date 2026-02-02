class Solution {
    public int[] findOrder(int n, int[][] pre) {
        int[] answer=new int[n];
        int[] indeg=new int[n];

        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<pre.length;i++){
            adj.get(pre[i][1]).add(pre[i][0]);
            indeg[pre[i][0]]++;
        }

        int idx=0;

        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indeg[i]==0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int node=queue.poll();
            answer[idx++]=node;

            for(int nei:adj.get(node)){
                indeg[nei]--;
                if(indeg[nei]==0){
                    queue.offer(nei);
                }
            }
        }
        if(n!=idx) return new int[0];
        return answer;
    }
}