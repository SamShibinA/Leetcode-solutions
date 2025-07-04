class Solution {
    public char kthCharacter(long k, int[] operations) {
        char c='a';
        ArrayList<Long> len=new ArrayList<>();
        long tem=1;
        for(int o:operations){
            tem*=2;
            len.add(tem);
            if(tem>=k) break;}

        int shift=0;
        for(int i=len.size()-1;i>=0;i--){
            long h=len.get(i)/2;

            if(k>h){
                k-=h;
                if(operations[i]==1){
                    shift++;
                }
            }
        }
        return (char)(c+(shift%26));
    }
}

