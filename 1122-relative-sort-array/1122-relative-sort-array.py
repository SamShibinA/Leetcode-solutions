class Solution(object):
    def relativeSortArray(self, arr1, arr2):
        """
        :type arr1: List[int]
        :type arr2: List[int]
        :rtype: List[int]
        """
        index=0

        for i in range(len(arr2)):
            for j in range(len(arr1)):
                if arr1[j]==arr2[i]:
                    arr1[index],arr1[j]=arr1[j],arr1[index]
                    index+=1
        arr1[index:]=sorted(arr1[index:])
        return arr1
