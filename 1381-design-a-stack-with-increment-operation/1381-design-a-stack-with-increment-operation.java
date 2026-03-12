class CustomStack {

    int peek;
    int[] stack;
    int max;
    public CustomStack(int maxSize) {
        this.peek=0;
        this.stack=new int[maxSize];
        this.max=maxSize;
    }
    
    public void push(int x) {
        if(peek<max){
            stack[peek++]=x;
        }
    }
    
    public int pop() {
        if(peek==0)return -1;
        return stack[--peek];
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k, peek);i++){
            stack[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */