class Solution {
    public boolean validMountainArray(int[] arr) {

        boolean down=false;
        boolean up=false;
        int n=arr.length;
        if(n<3)return false;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1] || arr[i]<arr[i+1] && down){
                return false;
            }
            else if(arr[i]>arr[i+1]){
                down =true;
            }
            else if(arr[i]<arr[i+1]){
                up=true;
            }
        }

        return true && down && up;
    }
}