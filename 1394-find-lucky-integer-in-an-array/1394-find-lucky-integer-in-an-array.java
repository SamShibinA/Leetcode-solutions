class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
     int ans=-1;
     int count=1;
     int n=arr.length;
     for(int i=1;i<n;i++){
        if(arr[i]==arr[i-1])count++;
        else{
        if(arr[i-1]==count){
            ans=Math.max(ans,arr[i-1]);
        }
        count=1;
        }
    }
     
     if(arr[n-1]==count){
        ans=Math.max(ans,arr[n-1]);
     }

     return ans;
}
}

