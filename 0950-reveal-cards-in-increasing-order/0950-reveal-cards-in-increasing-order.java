class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Deque<Integer> q=new ArrayDeque<>();
        Arrays.sort(deck);

        for(int i=n-1;i>=0;i--){
            if(!q.isEmpty()){
                q.addFirst(q.removeLast());
            }
            q.addFirst(deck[i]);
        }

        int[] res=new int[n];
        int idx=0;

        for(int num:q){
            res[idx++]=num;
        }

        return res;


        // return ans;
    }
}