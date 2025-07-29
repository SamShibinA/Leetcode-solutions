class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] reachable=new boolean[n];
        List<Integer>answer=new ArrayList<>();
        for(List<Integer> edge:edges){
            reachable[edge.get(1)]=true;
        }

        for(int i=0;i<n;i++){
            if(!reachable[i])answer.add(i);
        }

        return answer;
    }
}