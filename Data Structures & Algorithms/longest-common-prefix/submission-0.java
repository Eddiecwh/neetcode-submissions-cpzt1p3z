class Solution {
    public String longestCommonPrefix(String[] strs) {
        // early return if strs is empty
        if (strs.length == 0) return "";

        // Set prefix to 1st item in array
        String prefix = strs[0];

        // Iterate throguh strs, excluding 1st element
        for (int i = 1; i < strs.length; i++) {
            // while prefix is not at index 0 of current str
            while (strs[i].indexOf(prefix) != 0) {
                // chop of end of prefix, until it matches with string being compared to
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}