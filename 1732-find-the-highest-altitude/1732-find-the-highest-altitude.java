class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,n=gain.length;
        int[] altitude=new int[n+1];
        altitude[0]=0;
        for(int i=1;i<n+1;i++){
            altitude[i]=altitude[i-1]+gain[i-1];
            max=altitude[i]>max?altitude[i]:max;
        }
        return max;
        
    }
}