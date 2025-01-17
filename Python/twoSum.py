class Solution:
  def twoSum(self, nums: List[int], target: int) -> List[int]:
    for i in range(len(nums)):
      for j in range(i +1, len(nums)):
        if nums[i] + nums[j] == target:
          return [i, j]

# class Solution:
#     def twoSum(self, nums: List[int], target: int) -> List[int]:
#         hashtable = dict()
#         for i, num in enumerate(nums):
#             if target - num in hashtable:
#                 return [hashtable[target - num], i]
#             hashtable[nums[i]] = i
#         return []
# 項目	ハッシュテーブルを使った解法	二重ループを使った解法
# 時間計算量	O(n)	O(n^2)
# 空間計算量	O(n)	O(1)
