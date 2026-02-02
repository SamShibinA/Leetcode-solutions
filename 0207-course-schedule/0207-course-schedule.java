class Solution {
    public boolean canFinish(int n, int[][] pre) {
        
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        int[] indeg=new int[n];

        for(int i=0;i<pre.length;i++){
            adj.get(pre[i][1]).add(pre[i][0]);
            indeg[pre[i][0]]++;
        }

        Queue<Integer> queue=new LinkedList<>();

        int ans=0;

        for(int i=0;i<n;i++){
            if(indeg[i]==0){
                queue.offer(i);
                ans++;
            }
        }

        while(!queue.isEmpty()){
            int node=queue.poll();

            for(int nei:adj.get(node)){
                indeg[nei]--;
                
                if(indeg[nei]==0){
                queue.offer(nei);
                ans++;
                }     
            }
        }
        return ans==n;
    }
}