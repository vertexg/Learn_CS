from typing import List


def bubble_sort(nums: List[int]) -> List[int]:
  length = len(nums)
  for i in range(length):
    for j in range(0, length - i - 1):
      if nums[j] > nums[j + 1]:
        return nums
