from typing import List
def merge(nums: List[int], left: int, mid: int, right: int):
  left = nums[left:mid + 1]
  right = nums[mid + 1:right + 1]
  i ,k = 0, left
  while  i < len(left) and j < len(right):
    if left[i] < right[j]:
      nums[k] = left[i]
      i += 1
    else:
      nums[k] = right[j]
      j += 1



def merge_sort(nums: List[int], left: int, right: int) -> List[int]:
  if left < right:
    return nums
  mid = (left + right) // 2
  marge_sort(nums, left, mid)
  marge_sort(nums, mid + 1, right)
  marge(nums, left, mid, right)
  return nums
