class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (Integer num : nums) {
            seen.add(num);
        }

        int maxLength = 0;

        for (int num : nums) {
            if (!seen.contains(num - 1)) {
                int length = 1;

                while (seen.contains(num + length)) {
                    length += 1;
                }

                maxLength = Math.max(length, maxLength);
            } 
        }

        return maxLength;
    }
}
