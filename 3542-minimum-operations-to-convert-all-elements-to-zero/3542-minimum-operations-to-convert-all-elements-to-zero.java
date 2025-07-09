class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int operations=0;
        for(int n:nums){
            while(!stack.isEmpty()&&stack.peek()>n){
                stack.pop();
            }

            if(stack.peek()!=n){
            operations++;
            stack.push(n);
            }
        }

        return operations;
    }
}