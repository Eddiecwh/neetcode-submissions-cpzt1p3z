class Solution:
    def encode(self, strs: List[str]) -> str:
        result = ""
        for s in strs:
            encoded = f"{len(s):03d}" + s
            result += encoded
        return result

    def decode(self, s: str) -> List[str]:
        result = []
        
        i = 0
        length = 0

        while i < len(s):
            length = int(s[i:i+3])
            currentString = s[i+3 : i+3+length]
            result.append(currentString)
            i += 3 + length
        
        return result
