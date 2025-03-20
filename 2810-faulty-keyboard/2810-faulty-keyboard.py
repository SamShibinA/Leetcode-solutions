class Solution(object):
    def finalString(self, s):
        """
        :type s: str
        :rtype: str
        """
        ANS=''
        for i in s:
            if i!='i':
                ANS+=i
            else:
                ANS=ANS[::-1]
        return ANS