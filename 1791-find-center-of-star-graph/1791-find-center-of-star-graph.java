class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer>map=new HashMap<>();

        for(int[] edge:edges){
            map.put(edge[0],map.getOrDefault(edge[0],0)+1);
            map.put(edge[1],map.getOrDefault(edge[1],0)+1);

            if(map.get(edge[0])==edges.length)return edge[0];
            if(map.get(edge[1])==edges.length)return edge[1];
        }
        return -1;
    }
}