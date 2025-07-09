class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0,n=pushed.length;
        Stack<Integer> stack=new Stack<>();

        while(i<n&&j<n){
            if(!stack.contains(popped[j])){
                stack.push(pushed[i++]);
            }

            while(!stack.isEmpty()&&stack.peek()==popped[j]){
                stack.pop();
                j++;
            }

            if(!stack.isEmpty()&&stack.contains(popped[j])&&stack.peek()!=popped[j]){
                return false;
            }

        }

        return stack.isEmpty();
    }
}