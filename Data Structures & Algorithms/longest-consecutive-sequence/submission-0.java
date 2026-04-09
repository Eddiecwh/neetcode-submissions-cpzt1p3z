class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> newSet = new HashSet<>();
        for (int num : nums) {
            newSet.add(num);
        }

        int longest = 0;

        for (Integer num : newSet) {
            if (!newSet.contains(num - 1)) {
                int length = 1;
                while (newSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
