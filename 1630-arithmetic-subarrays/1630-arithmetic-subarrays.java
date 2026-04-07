class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans=new ArrayList<>();

        for(int i=0;i<l.length;i++){
            
            boolean flag=true;
            int start=l[i];
            int end=r[i];

            int[] temp=Arrays.copyOfRange(nums,start,end+1);

            Arrays.sort(temp);

            for(int j=2;j<temp.length;j++){
                if(temp[j-2] - temp[j-1] != temp[j-1] - temp[j]){
                    ans.add(false);
                    flag=false;
                    break;
                }
            }
            if(flag)
            ans.add(true);
        }

        return ans;
    }
}