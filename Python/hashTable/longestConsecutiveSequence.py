from typing import List

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hash = set(nums)
        length = 0
        for num in hash:
            if num -1 not in hash:
                cur = num
                cur_length = 1
                while cur + 1 in hash:
                    cur += 1
                    cur_length +=1
                length = max(length, cur_length)
        return length
