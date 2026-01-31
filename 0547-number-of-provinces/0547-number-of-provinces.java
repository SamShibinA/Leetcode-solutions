class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;

        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }

        Queue<Integer> queue=new LinkedList<>();

        int ans=0;

        boolean[] visited=new boolean[n];

        for(int i=0;i<n;i++){
            if(!visited[i]){
                queue.offer(i);
                visited[i]=true;
                ans++;

                while(!queue.isEmpty()){
                    int node=queue.poll();
                    for(int nodes:adj.get(node)){
                        if(!visited[nodes]){
                       queue.offer(nodes);
                        visited[nodes]=true;
                        }
                    }
                }
            }
        }

        return ans;
        
    }
}