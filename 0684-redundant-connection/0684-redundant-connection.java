class Solution {

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
            if(parent[x]!=x)parent[x]=find(parent[x]);
            return parent[x];
        }

        public boolean union(int u,int v){
            int pu=find(u);
            int pv=find(v);

            if(pu==pv)return false;

            if(rank[pu]>rank[pv]){
                parent[pv]=pu;
            }
            else if(rank[pu]<rank[pv]){
                parent[pu]=pv;
            }
            else{
                parent[pv]=pu;
                rank[pu]++;
            }
            return true;
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;

        DSU dsu=new DSU(n+1);

        int x=0,y=0;

        for(int[] edge:edges){
            if(!dsu.union(edge[0],edge[1])){
                x=edge[0];
                y=edge[1];
            }
        }

        return new int[]{x,y};

    }
}