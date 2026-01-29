class Solution {
    public int clumsy(int n) {
        Stack<Integer> st=new Stack<>();
        int current_op=0;
        st.push(n);
        for(int i=n-1;i>=1;i--,current_op++){
            int op=current_op % 4;

            if(op==0){
                if(!st.isEmpty()){
                    st.push(i* st.pop());
                }
                else{
                    st.push(i);
                }
            }
            else if(op==1){
                st.push(st.pop()/i);
            }
            else if(op==2){
                st.push(i);
            }
            else{
                st.push(-i);
            }
        }

        int sum=0;
        while(!st.isEmpty())sum+=st.pop();

        return sum;
    }
}