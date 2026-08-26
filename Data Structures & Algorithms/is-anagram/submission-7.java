class Solution {
    public boolean isAnagram(String s, String t) {
      Map<Character, Integer> sMap = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : t.toCharArray()) {
            sMap.put(ch, sMap.getOrDefault(ch, 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if (entry.getValue() != 0) return false;
        }

        return true;
    }
}
