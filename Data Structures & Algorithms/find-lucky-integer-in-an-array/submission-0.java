class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxNum = 0;

        for (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                maxNum = Math.max(maxNum, entry.getKey());
            }
        }
        
        return maxNum != 0 ? maxNum : -1 ;
    }
}