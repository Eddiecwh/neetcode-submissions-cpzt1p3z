class Solution {
    public int characterReplacement(String s, int k) {
        // min replacements needed is:
        // windowSize - # of most freq character
        // if above is <= k, window is good
        int left = 0;
        int max = 0;

        Map<Character, Integer> count = new HashMap<>();

        int maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            // store right in hashmap
            if (!count.containsKey(s.charAt(right))) {
                count.put(s.charAt(right), 1);
            } else {
                count.put(s.charAt(right), count.get(s.charAt(right)) + 1);
            }

            maxFreq = Math.max(maxFreq, count.get(s.charAt(right)));

            // check window validity
            if (right - left + 1 - maxFreq > k) {
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left++;
            }

            max = Math.max(right - left + 1, max);
        }

        return max;
    }
}
