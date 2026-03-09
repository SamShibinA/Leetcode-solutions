class Solution {
    public int[] rearrangeArray(int[] nums) {
        int no=nums.length;
        int[] answer=new int[no];
        int p=0,n=1;

        for(int num:nums){
            if(num>0){
                answer[p]=num;
                p+=2;
            }
            else{
                answer[n]=num;
                n+=2;
            }
           
        }
        return answer;
    }
}