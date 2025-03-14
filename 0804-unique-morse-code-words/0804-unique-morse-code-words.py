class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:

        dic=[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

        ans=[]

        for word in words:
            temp=""
            for letter in word:
                temp+=dic[ord(letter)-97]
            ans.append(temp)
        
        return len(set(ans))