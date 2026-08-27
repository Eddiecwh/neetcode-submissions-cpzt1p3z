class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        // 3 : 0
        // 4 : 1
        // 5 : 2
        // 6 : 3

        // target = 7
        // complement = 7 - 3 = 4

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numsMap.containsKey(complement)) {
                int indexComplement = numsMap.get(complement);

                if (indexComplement > i) {
                    return new int[]{i, indexComplement};
                } else {
                    return new int[]{indexComplement, i};
                }
            }

            numsMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
