class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        result = [0] * len(temperatures)
        stack = []

        for i, temp in enumerate(temperatures):
            
            while stack and temperatures[i] > temperatures[stack[-1]]:
                popped_index = stack[-1]
                stack.pop()
                result[popped_index] = i - popped_index
            stack.append(i)

        return result