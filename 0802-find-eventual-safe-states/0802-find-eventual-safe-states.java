class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;

        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++)adj.add(new ArrayList<>());

        int[] outdeg=new int[n];
        boolean[] safe=new boolean[n];

        for(int i=0;i<n;i++){
            outdeg[i]=graph[i].length;

            for(int nei:graph[i]){
                adj.get(nei).add(i);
            }
        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(outdeg[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int node=q.poll();
            safe[node]=true;

            for(int pre:adj.get(node)){
                outdeg[pre]--;
                if(outdeg[pre]==0){
                    q.offer(pre);
                }
            }

        }

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(safe[i])ans.add(i);
        }

        return ans;
    }
}