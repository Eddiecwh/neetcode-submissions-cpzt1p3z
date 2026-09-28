class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
    const map = new Map<string, number>();

        if (s.length !== t.length) return false;

        for (let i = 0; i < s.length; i++) {
            map.set(s[i], (map.get(s[i]) ?? 0) + 1);
            map.set(t[i], (map.get(t[i]) ?? 0) - 1);
        }

        for (const count of map.values()) {
            if (count !== 0) return false;
        }

        return true;
    }
}
