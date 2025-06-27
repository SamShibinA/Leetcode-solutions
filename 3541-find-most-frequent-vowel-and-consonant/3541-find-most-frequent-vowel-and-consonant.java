class Solution {
    Map<Character,Integer> freq=new HashMap<>();

    public int maxFreqSum(String s) {
    int vowel_c=0,consonant_c=0;
    for(char c:s.toCharArray()){
        freq.put(c,freq.getOrDefault(c,0)+1);
        int f=freq.get(c);
        if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'){
            vowel_c=Math.max(vowel_c,f);
        }
        else{
            consonant_c=Math.max(consonant_c,f);
        }
    }

    return vowel_c+consonant_c;

    }
}