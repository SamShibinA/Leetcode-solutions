class Solution(object):
    def countMatches(self, items, ruleKey, ruleValue):
        """
        :type items: List[List[str]]
        :type ruleKey: str
        :type ruleValue: str
        :rtype: int
        """
        idx=int()
        if(ruleKey=='color'):
            idx=1
        elif(ruleKey=='type'):
            idx=0
        else:
            idx=2
        c=0

        for i in range(0,len(items)):
            if items[i][idx]==ruleValue:
                c+=1
        
        return c