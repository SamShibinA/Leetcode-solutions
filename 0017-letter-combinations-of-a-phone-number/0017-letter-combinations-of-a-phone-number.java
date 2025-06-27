class Solution {
    Map<Character,String> phone=new HashMap<>();

    List<String> ans=new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) return ans;
        phone.put('2',"abc");
        phone.put('3',"def");
        phone.put('4',"ghi");
        phone.put('5',"jkl");
        phone.put('6',"mno");
        phone.put('7',"pqrs");
        phone.put('8',"tuv");
        phone.put('9',"wxyz");
        
      combinate(digits.toCharArray(),0,"");
      return ans;
    }

    public void combinate(char[] digits,int idx,String cur){
        

        if(cur.length()==digits.length&&!cur.isEmpty()){
            ans.add(cur);
            return;
        }

        for(char c:phone.get(digits[idx]).toCharArray()){
        combinate(digits,idx+1,cur+c);
        }

}}