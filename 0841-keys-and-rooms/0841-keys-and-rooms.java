class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        dfs(0,visited,rooms);

        for(boolean visit:visited){
            if(!visit)return false;
        }

        return true;
    }
    

    void dfs(int node,boolean[] visited,List<List<Integer>> rooms){
        if(visited[node])return;

        visited[node]=true;

        for(int key:rooms.get(node)){
            dfs(key,visited,rooms);
        }

    }
}