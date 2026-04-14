class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}

        for num in nums:
            freq[num] = freq.get(num, 0) + 1
        
        result = sorted(freq.items(), key=lambda x: x[1], reverse=True)
        
        return [num for num, freq in result[:k]]