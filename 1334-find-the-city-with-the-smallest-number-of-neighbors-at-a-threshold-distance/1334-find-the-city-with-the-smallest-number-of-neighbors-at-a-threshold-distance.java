class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        List<List<int[]>> graph = new ArrayList<>();

        for(int i=0;i<n;i++)graph.add(new ArrayList<>());

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];

            graph.get(u).add(new int[]{v,w});
            graph.get(v).add(new int[]{u,w});
        }

        int min=Integer.MAX_VALUE;
        int city=-1;

        for(int i=0;i<n;i++){
            int count=dijkstra(n,graph,i,distanceThreshold);

            if(count<=min){
                min=count;
                city=i;
            }
        }

        return city;
    }


    public int dijkstra(int n, List<List<int[]>> graph,int src,int distance){
        int[] dist=new int[n];

        Arrays.fill(dist,Integer.MAX_VALUE);

        dist[src]=0;

        PriorityQueue<int[]> q=new PriorityQueue<>((a,b) -> a[1]-b[1]);

        q.offer(new int[]{src,0});

        while(!q.isEmpty()){

            int[] c=q.poll();
            int node=c[0];
            int d=c[1];

            if(d>dist[node] || d> distance) continue;
            for(int[] nei:graph.get(node)){
                if(nei[1]+d<dist[nei[0]]){
                    dist[nei[0]]=d+nei[1];
                    q.offer(new int[]{nei[0],dist[nei[0]]});
                }
            }
        }


        int count=0;

        for(int i=0;i<n;i++){
            if( i!=src && dist[i] <= distance)count++;
        }

        return count;
    }
}