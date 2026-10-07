class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int len=nums.length;

        List<Integer>[] lists=new List[len+1];

        for(int i=0;i<=len;i++){
            lists[i]=new ArrayList<>();
        }

        for(int n:map.keySet()){
            lists[map.get(n)].add(n);
        }

        int ans[]=new int[k];

        int idx=0;

        for(int i=len;i>=1;i--){
            for(int n:lists[i]){
                ans[idx++]=n;

                if(idx==k){
                    return ans;
                }
            }
        }

        return ans;
    }
}