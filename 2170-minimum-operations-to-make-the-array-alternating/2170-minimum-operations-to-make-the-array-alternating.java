class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer,Integer> odd=new HashMap<>();
        Map<Integer,Integer> even=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.put(nums[i],even.getOrDefault(nums[i],0)+1);
            }
            else{
                odd.put(nums[i],odd.getOrDefault(nums[i],0)+1);
            }
        }

        int[] eventop = get_top(even);
        int[] oddtop = get_top(odd);

        if(eventop[0]!=oddtop[0]){
            return n - (eventop[1]+oddtop[1]);
        }

        return Math.min(n-(eventop[1]+oddtop[3]),n-(eventop[3]+oddtop[1]));
    }

    public int[] get_top(Map<Integer,Integer> map){
        int num1=0,count1=0,num2=0,count2=0;
        for(var entry:map.entrySet()){
            int num=entry.getKey();
            int count=entry.getValue();

            if(count>count1){
                num2=num1;
                count2=count1;
                num1=num;
                count1=count;
            }
            else if(count>count2){
                num2=num;
                count2=count;
            }
        }

        return new int[]{num1,count1,num2,count2};
    }
}