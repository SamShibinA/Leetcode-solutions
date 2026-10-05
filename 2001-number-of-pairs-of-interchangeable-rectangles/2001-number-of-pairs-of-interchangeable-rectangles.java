class Solution {
    public long interchangeableRectangles(int[][] r) {
        long ans=0;

        HashMap<Double,Integer> hm=new HashMap<>();

        for(int[] temp:r){
            double ratio= (double)temp[0]/temp[1];
            if(hm.containsKey(ratio)){
                ans+=hm.get(ratio);
                hm.put(ratio,hm.get(ratio)+1);
            }
            else{
                hm.put(ratio,1);
            }
        }

        return ans;
    }
}