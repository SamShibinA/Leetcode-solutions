class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> num=new ArrayList<>();

        for(int i=1;i<=m;i++)num.add(i);

        for(int i=0;i<queries.length;i++){
            int n=queries[i];
            int index=num.indexOf(n);
            queries[i]=index;
            num.remove(index);
            num.add(0,n);
        }

        return queries;
    }
}