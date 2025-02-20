from heapq import heappush, heappop
from typing import List

class Solution:
    def smallestChair(self, times: List[List[int]], targetFriend: int) -> int:
        n = len(times)

        events = []
        for i, (arrival, leaving) in enumerate(times):
            events.append((arrival, 'arrive', i))
            events.append((leaving, 'leave', i))

        events.sort(key=lambda x: (x[0], x[1] == 'arrive'))

        available_chairs = []
        for i in range(n):
            heappush(available_chairs, i)  
        
        chair_assignment = {}
        
     
        for time, event_type, friend in events:
            if event_type == 'arrive':
                chair = heappop(available_chairs)
                chair_assignment[friend] = chair
                
                if friend == targetFriend:
                    return chair
            else:  
                heappush(available_chairs, chair_assignment[friend])
