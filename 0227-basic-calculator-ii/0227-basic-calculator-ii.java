class Solution {
    public int calculate(String s) {
        Stack<Integer> number=new Stack<>();
        Stack<Character> op=new Stack<>();

        int i=0,n=s.length();

        while(i<n){
            char c=s.charAt(i);
            if(c==' '){
                i++;
                continue;
            }
            else if(Character.isDigit(c)){
                  int num=0;

                  while(i<n&&Character.isDigit(s.charAt(i))){
                    num=num*10+(s.charAt(i)-'0');
                    i++;
                  }

                  number.push(num);
                  continue;

            }
            else{
                while(!op.isEmpty()&&prec(op.peek())>=prec(c)){
                    int n2=number.pop();
                    int n1=number.pop();
                    number.push(res(n1,n2,op.pop()));
                }
                op.push(c);
            }
            i++;
        }

        while(!op.isEmpty()){
            int n2=number.pop();
            int n1=number.pop();
            number.push(res(n1,n2,op.pop()));
        }

        return number.pop();

    }

    public int res(int n1,int n2,char c){
         switch(c){
            case '+':
            return n1+n2;
            
            case '-':
            return n1-n2;
            
            case '*':
            return n1*n2;
            
            case '/':
            return n1/n2;
            
        }
        return n1;
    }
    public int prec(char c){
        switch (c){
            case '+':
            case '-':
            return 1;
            case '*':
            case '/':
            return 2;
            case '^':
            return 3;
            case '(':
            return 0;
        }
        return 0;
    }
}


