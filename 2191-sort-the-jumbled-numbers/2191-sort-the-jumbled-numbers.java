class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[][] num=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            num[i][0]=nums[i];
            num[i][1]=getVal(nums[i],mapping);
        }

        Arrays.sort(num, (a,b) -> a[1] - b[1]);

        for(int i=0;i<nums.length;i++){
            nums[i]=num[i][0];
        }

        
        return nums;

    }

    public int getVal(int num,int[] mapping){
        if(num==0)return mapping[0];
        int place=1;
        int val=0;
        while(num>0){
            int d=num%10;
            val+=mapping[d] * place;
            place*=10;
            num/=10;
        }
        return val;
    }
}