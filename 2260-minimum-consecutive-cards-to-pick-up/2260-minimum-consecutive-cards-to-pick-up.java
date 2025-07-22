class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer,Integer>seen=new HashMap<>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<cards.length;i++){
            if(seen.containsKey(cards[i])){
                int idx=i-seen.get(cards[i])+1;
                min=min<idx?min:idx;
            }
            seen.put(cards[i],i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}