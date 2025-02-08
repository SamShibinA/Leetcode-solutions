class Solution(object):
    def findMinArrowShots(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """

        if not points:
            return 0

        points.sort(key=lambda x: x[1])

        arrows = 1  
        last_arrow_position = points[0][1]  

        for i in range(1, len(points)):
            if points[i][0] > last_arrow_position:  
                arrows += 1  
                last_arrow_position = points[i][1]  

        return arrows
