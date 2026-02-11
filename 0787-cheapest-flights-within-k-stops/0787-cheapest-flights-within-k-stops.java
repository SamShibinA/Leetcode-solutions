class Solution {

    class Pair{
        int to,price,stop;

        Pair(int to,int price,int stop){
            this.to=to;
            this.price=price;
            this.stop=stop;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        List<List<Pair>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:flights){
            adj.get(edge[0]).add(new Pair(edge[1],edge[2],0));
        }

        int[][] dist=new int[n][k+2];
        for(int i=0;i<n;i++) Arrays.fill(dist[i],Integer.MAX_VALUE);

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> a.price -b.price);

        pq.offer(new Pair(src,0,0));

        while(!pq.isEmpty()){
            Pair node=pq.poll();

            int u=node.to;
            int price=node.price;
            int stop=node.stop;

            if(u==dst) return price;
            if(stop>k)continue;

            for(Pair edge:adj.get(u)){
                int v=edge.to,vprice=edge.price;

                int new_price=price+vprice;


                if(new_price<dist[v][stop+1]){
                dist[v][stop+1]=new_price;
                pq.offer(new Pair(v,new_price,stop+1));
                }        
            }
        }

        return -1;
    }
}