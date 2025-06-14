class Solution {
    public int minMaxDifference(int n) {
        String s=String.valueOf(n);
        return max(s)-min(s);
    }

    public static int max(String s){
        char[] arr=s.toCharArray();
        char tar=' ';

        for(char c:arr){
            if(c!='9'){
                tar=c;
                break;
            }
        }

        if(tar==' ') return Integer.parseInt(s);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                arr[i]='9';    
            }
        }

        return Integer.parseInt(new String(arr));
       
    }


     public static int min(String s){
      char[] arr=s.toCharArray();
      char tar=' ';
      for(char c:arr){
        if(c!='0'){
            tar=c;
            break;
        }
      }

      if(tar==' ')return Integer.parseInt(s);

      for(int i=0;i<arr.length;i++){
        if(arr[i]==tar)arr[i]='0';
      }

      return Integer.parseInt(new String(arr));

     }
}


