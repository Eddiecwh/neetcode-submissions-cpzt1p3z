class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = {}
        
        for s in strs:
            current = "".join(sorted(s))
            if current not in result:
                strList = []
                strList.append(s)
                result[current] = strList
            else:
                result[current].append(s)

        return list(result.values())
