class Solution(object):
    def convertDateToBinary(self, date):
        """
        :type date: str
        :rtype: str
        """
        return '-'.join([bin(int(num))[2:] for num in date.split('-')])