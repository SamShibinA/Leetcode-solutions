class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> elements=new HashSet<>();
        int sum=0,max=0,i=0,j=0;

        while(i<nums.length && j<nums.length){
            if(elements.contains(nums[j])){
                elements.remove(Integer.valueOf(nums[i]));
                sum-=nums[i];
                i++;
            }
            else{
               elements.add(nums[j]);
               sum+=nums[j]; 
               max=max>sum?max:sum;
               j++;
            }
        }

        return max;

    }
}