class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int num : nums) {
            if (result.containsKey(num)) {
                result.put(num, result.get(num) + 1);
            } else {
                result.put(num, 1);
            }
        }

        return result.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .get()
            .getKey();
    }
}