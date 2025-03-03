class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        front=[]
        p=[]
        back=[]

        for num in nums:
            if num < pivot:
                front.append(num)
            elif num==pivot:
                p.append(num)
            else:
                back.append(num)
        
        return front+p+back