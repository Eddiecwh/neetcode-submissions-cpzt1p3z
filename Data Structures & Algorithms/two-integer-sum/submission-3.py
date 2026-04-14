class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = []
        myMap = {}

        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in myMap:
                result.append(nums.index(complement))
                result.append(i)
            else:
                myMap[nums[i]] = i

        return result