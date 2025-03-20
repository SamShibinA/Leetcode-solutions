class Solution(object):
    def kthDistinct(self, arr, k):
        """
        :type arr: List[str]
        :type k: int
        :rtype: str
        """

        ans=[i for i in arr if arr.count(i)==1]       
        if len(ans)<k:
            return ""
        
        return ans[k-1]