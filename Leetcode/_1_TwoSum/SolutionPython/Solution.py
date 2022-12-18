class Solution(object):
    def twoSum(nums, target):
        indices = {}
        for i, num in enumerate(nums):
            if target - num in indices:
                return [indices[target - num], i]
            indices[num] = i
        return []
