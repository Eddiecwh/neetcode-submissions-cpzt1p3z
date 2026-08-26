class Solution {
    public boolean isAnagram(String s, String t) {
      Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        if (sMap.equals(tMap)) return true;
        else return false;
    }
}
