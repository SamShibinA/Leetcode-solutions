class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n=edges.length + 1 ;

        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++)adj.add(new ArrayList<>());

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] bobTime=getbobTime(adj,bob,n);

        Queue<int[]> q=new LinkedList<>();

        int alice=Integer.MIN_VALUE;

        q.offer(new int[]{0,0,0});

        Set<Integer> set=new HashSet<>();

        set.add(0);

        while(!q.isEmpty()){
            int[] curr=q.poll();
            int node=curr[0];
            int time=curr[1];
            int c_amount=curr[2];

            if(time<bobTime[node]){
                c_amount+=amount[node];
            }
            else if(time==bobTime[node]){
                c_amount+=(amount[node]/2);
            }

            boolean isLeaf=true;

            for(int nei:adj.get(node)){
                if(!set.contains(nei)){
                    q.offer(new int[]{nei,time+1,c_amount});
                    set.add(nei);
                    isLeaf=false;
                }
            }

            if(isLeaf)alice=Math.max(alice,c_amount);

        }

        return alice;
    }

    public int[] getbobTime(List<List<Integer>> adj,int bob,int n){
        int[] answer=new int[n];

        Queue<int[]> q=new LinkedList<>();

        int[] par=new int[n];

        Arrays.fill(par,-1);

        dfs(0,-1,par,adj);
        
        Arrays.fill(answer,Integer.MAX_VALUE);

        int time=0;

        int node=bob;

        while(node!=-1){
            answer[node]=time++;
            node=par[node];
        }

        return answer;
    }

    public void dfs(int node,int p,int[] parent,List<List<Integer>> adj){
        parent[node]=p;

        for(int nei:adj.get(node)){
            if(nei!=p){
                dfs(nei,node,parent,adj);
            }
        }
    }




}