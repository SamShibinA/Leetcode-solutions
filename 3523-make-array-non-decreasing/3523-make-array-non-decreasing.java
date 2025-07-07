class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> st=new Stack<>();
        boolean flag=false;

        for(int n:nums){

            if(!st.isEmpty()&&st.peek()>n&&!flag){
                flag=true;
            }
            st.push(n);

            if(flag){
                flag=false;
                st.pop();
            }
        }
        return st.size();
    }
}