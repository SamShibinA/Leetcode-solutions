class Solution {

    class Pair{
        int v;
        double w;

        Pair(int v,double w){
            this.v=v;
            this.w=w;
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] prob=new double[n];

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> Double.compare(b.w,a.w));

        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][1],succProb[i]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0],succProb[i]));
        }

        pq.offer(new Pair(start_node,1));

        while(!pq.isEmpty()){
            Pair node=pq.poll();
            int u=node.v;
            double w=node.w;

            if(w<prob[u])continue;

            for(Pair edge:adj.get(u)){
                int v=edge.v;
                double v_w=edge.w;
                double n_w=v_w * w;

                if(n_w>prob[v]){
                    prob[v]=n_w;
                    pq.offer(new Pair(v,n_w));
                }
            }
        }

        return prob[end_node];
    }
}