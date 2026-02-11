class Solution {
    class DSU{
        Map<Integer,Integer> map=new HashMap<>();

        public int find(int x){
            map.putIfAbsent(x,x);
            if(map.get(x)!=x)map.put(x,find(map.get(x)));
            return map.get(x);
        }

        public void union(int u,int v){
            int u_root=find(u);
            int v_root=find(v);
            if(u_root!=v_root) map.put(u_root,v_root);
        }
    }
    public int removeStones(int[][] stones) {
        DSU dsu =new DSU();
        for(int[] stone:stones){
            dsu.union(stone[0],stone[1]);
        }

        Set<Integer> uniqueRoots=new HashSet<>();

        for(int[] stone:stones){
            uniqueRoots.add(dsu.find(stone[0]));
        }

        return stones.length-uniqueRoots.size();
    }
}