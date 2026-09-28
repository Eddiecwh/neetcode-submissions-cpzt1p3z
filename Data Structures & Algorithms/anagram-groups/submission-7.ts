class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs: string[]): string[][] {
        let result = new Map<string, string[]>();

        for (const str of strs) {
            const sortedStr = str.split("").sort().join("");

            const sortedList = result.get(sortedStr);

            if (sortedList === undefined) {
                result.set(sortedStr, [str]);
            } else {
                sortedList.push(str);
            }
        }

        return [...result.values()];
    }
}
