class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<=2*n;i++){
            int idx=i%n;
            while(!stack.isEmpty()&&nums[idx]>nums[stack.peek()]){
                int top=stack.pop();
                res[top]=nums[idx];
            }
            if(i<n)stack.push(i);
        }

    return res;
    }
}