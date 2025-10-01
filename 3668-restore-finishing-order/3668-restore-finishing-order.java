class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];
        int i=0;
        for(int o:order)for(int f:friends){
            if(i==friends.length)break;
            if(o==f){
                ans[i++]=o;
                break;
            }

        }

        return ans;
    }
}