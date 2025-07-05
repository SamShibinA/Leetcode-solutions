class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_idx={}
        start=0
        mlen=0

        for end in range(len(s)):
            char=s[end]
            if char in char_idx:
                start=max(start,char_idx[char]+1)
            char_idx[char]=end
            mlen=max(mlen,end-start+1)

        return mlen
