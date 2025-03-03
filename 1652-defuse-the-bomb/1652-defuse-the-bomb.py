from typing import List

class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        n = len(code)
        if k == 0:
            return [0] * n

        result = [0] * n
        extended_code = code * 2

        if k > 0:
            for i in range(n):
                result[i] = sum(extended_code[i + 1:i + 1 + k])
        elif k < 0:
            k = -k
            for i in range(n):
                result[i] = sum(extended_code[n + i - k:n + i])

        return result
