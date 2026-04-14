class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleaned = [ c for c in s.lower() if c.isalnum() ]

        i = 0
        j = len(cleaned) - 1

        while i < j:
            left = cleaned[i]
            right = cleaned[j]
            if left == right:
                i += 1
                j -= 1
            else:
                return False
        
        return True
        