class Solution {
    List<List<Integer>> answer=new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        add(0,graph,new ArrayList<>());
        return answer;
    }

    void add(int node,int[][] graph,List<Integer> current){
        
        current.add(node);
            
        if(node!=graph.length-1){
            for(int neighbour:graph[node]){
              
                add(neighbour,graph,current);

            }
        }
        else{
            answer.add(new ArrayList<>(current));
        }

        current.remove(current.size()-1);
    }
}