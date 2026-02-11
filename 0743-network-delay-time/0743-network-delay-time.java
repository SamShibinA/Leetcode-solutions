class Solution {

    class Pair{
        int v,w;

        Pair(int v,int w){
            this.v=v;
            this.w=w;
        }

    }

    public int networkDelayTime(int[][] times, int n, int k) {
        
        List<List<Pair>> adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:times){
            adj.get(edge[0]).add(new Pair(edge[1],edge[2]));
        }

        PriorityQueue<Pair> queue=new PriorityQueue<>((a,b) -> a.w - b.w);
        queue.offer(new Pair(k,0));

        int[] dist=new int[n+1];

        Arrays.fill(dist,Integer.MAX_VALUE);

        dist[k]=0;
        
        while(!queue.isEmpty()){
            Pair node=queue.poll();

            int u=node.v,d=node.w;

            if(d>dist[u])continue;

            for(Pair edge:adj.get(u)){
                int new_d=dist[u]+ edge.w;

                if(new_d < dist[edge.v]){
                    dist[edge.v]=new_d;
                    queue.offer(new Pair(edge.v,dist[edge.v]));
                }
            }
        }

        int max=0;

        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE)return -1;
            max=max>dist[i]?max:dist[i];
        }



        return max;
    }
}