class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        count={}
        res=0
    
        for word in words:
            l=list(word)
            l.sort()
            word=str(l)        
            count[word]=count.get(word,0)+1
            if(count[word]>=2):
                res+=1
                count[word]=-10

        return res