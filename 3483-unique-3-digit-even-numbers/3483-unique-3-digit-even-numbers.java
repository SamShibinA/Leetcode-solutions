class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> ans=new HashSet<>();
        int l=digits.length;

        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                for(int k=0;k<l;k++){
                    if(i!=j&&j!=k&&i!=k){
                        int n=digits[i]*100+digits[j]*10+digits[k];
                        if(n%2==0&&n>=100&&n<=999){
                            ans.add(n);
                        }
                    }
                }
            }
        }

        return ans.size();
    }
}

