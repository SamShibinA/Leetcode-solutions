class Solution {
    public int[] rearrangeArray(int[] nums) {
        int no=nums.length;
        int[] answer=new int[no];
        int p=0,n=0;

        for(int i=0;i<no;i++){
            while(nums[p] < 0){
                p++;
            }

            while(nums[n]>0){
                n++;
            }

            answer[i++]=nums[p++];
            answer[i]=nums[n++];
        }
        return answer;
    }
}