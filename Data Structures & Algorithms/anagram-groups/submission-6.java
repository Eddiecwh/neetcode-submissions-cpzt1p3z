class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // group the strings into their sorted versions
        // act = act
        // pots = opst
        // tops = optt
        // cat = act

        // hashmap, to store:
        // key: sorted version
        // value: list of the actual word

        // print all the values, by their groups

        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            char[] strArray = str.toCharArray();
            char[] sortedArray = strArray;
            Arrays.sort(sortedArray);
            anagrams.computeIfAbsent(new String(sortedArray), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}
