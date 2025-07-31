class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;

        for(int i=0;i<words.length;i++){
            String pre=words[i];

            for(int j=i+1;j<words.length;j++){
                String suf=words[j];

                    if (suf.startsWith(pre) && suf.endsWith(pre))
                    count++;
                    
            }
        }

        return count;
        
    }
}