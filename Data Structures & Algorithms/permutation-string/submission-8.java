class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> currentMap = new HashMap<>();

        if (s1.length() > s2.length()) return false;

        // get keyvalue mapping in hash1 for s1
        for (Character c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        String currentWindow = s2.substring(i, s1.length() + i);

        // get keyvalue mapping in has2 for s2
        for (Character c : currentWindow.toCharArray()) {
            currentMap.put(c, currentMap.getOrDefault(c, 0) + 1);
        }

        // do a sliding window of size s1.length
        for (i = 0; i < s2.length() - s1.length(); i++) {
            // compare, if hash1 = has2 return true
            if (s1Map.equals(currentMap)) return true;

            Character left = s2.charAt(i);
            Character right = s2.charAt(i + s1.length());

            currentMap.put(left, currentMap.get(left) - 1);
            if (currentMap.get(left) == 0 ) currentMap.remove(left);

            currentMap.put(right, currentMap.getOrDefault(right, 0) + 1);
        }

        if (s1Map.equals(currentMap)) return true;

        // return false at end if not found
        return false;
    }
}
