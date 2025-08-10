class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] answer=new int[n];
        Arrays.fill(answer,-1);

        for(int i=0;i<n-1;i++){
            int j=i+1;
            int max_index=j;

            while(j<n){
                if(arr[j]>arr[max_index])max_index=j;
                j++;
            }

            answer[i]=arr[max_index];

        }
        return answer;
    }
}