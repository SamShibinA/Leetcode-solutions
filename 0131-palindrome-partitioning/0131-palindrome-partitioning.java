class Solution {
    List<List<String>> answer;

    public List<List<String>> partition(String s) {
        answer=new ArrayList<>();
        traverse(new ArrayList<>(),0,s);
        return answer;
    }

    public void traverse(List<String> temp,int idx,String s){
        if(idx==s.length()){
            answer.add(new ArrayList<>(temp));
            return;
        }

        for(int end=idx;end<s.length();end++){
            

            String t=s.substring(idx,end+1);

            if(isPalin(t)){
                temp.add(t);
                traverse(temp,end+1,s);
                temp.remove(temp.size()-1);
            }
        }

    }


    public boolean isPalin(String s){
        int right=s.length()-1,left=0;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            right--;
            left++;
        }

        return true;
    }
}