from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
      hashtable = dict()
      for i , num in enumerate(nums):
                if num in hashtable:
                    return True
                hashtable[num] = i
      return False

# class Solution:
#     def containsDuplicate(self, nums):
#         seen = set()  # Create a hash set to store seen elements

#         for num in nums:
#             if num in seen:
#                 return True  # Duplicate found
#             seen.add(num)  # Add the element to the set

#         return False  # No duplicates found

class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
         hash = set()
         for i ,num in enumerate(nums):
             if i > k:
                 hash.remove(nums[i-k-1])
             if num in hash:
                 return True
             hash.add(num)
         return False
