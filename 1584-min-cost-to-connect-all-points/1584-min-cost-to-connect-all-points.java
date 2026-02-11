class Solution {

    class Edge{
        int u,v,w;

        Edge(int u,int v,int w){
            this.u=u;
            this.v=v;
            this.w=w;
        }
    }

    

    class DSU{
        int[] parent;
        int[] rank;

        DSU(int n){
            parent=new int[n];
            rank=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
                rank[i]=0;
            }
        }

        public int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]);
            }
            
            return parent[x];
        }

        public boolean union(int u,int v){
            
            int u_root=find(u);
            int v_root=find(v);
            if(u_root==v_root)return false;

            if(rank[u_root]>rank[v_root]){
                parent[v_root]=u_root;
            }
            else if(rank[u_root]<rank[v_root]){
                parent[u_root]=v_root;
            }
            else{
                parent[v_root]=u_root;
                rank[u_root]++;
            }
            return true;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Edge> pq=new PriorityQueue<>((a,b) -> a.w - b.w);
        
        int n=points.length;
        DSU dsu=new DSU(n);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int w=Math.abs(points[i][0]-points[j][0]) + Math.abs(points[i][1]-points[j][1]);
                pq.offer(new Edge(i,j,w));
            }
        }


        int answer=0;

        while(!pq.isEmpty()){
            Edge node=pq.poll();

            
            if(dsu.union(node.u,node.v)){
            answer+=node.w;
            }
        }


     return answer;
    }
}