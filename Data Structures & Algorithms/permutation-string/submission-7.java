class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> currentMap = new HashMap<>();

        if (s1.length() > s2.length()) return false;

        // get keyvalue mapping in hash1 for s1
        for (Character c : s1.toCharArray()) {
            if (s1Map.containsKey(c)) {
                s1Map.put(c, s1Map.get(c) + 1);
            } else {
                s1Map.put(c, 1);
            }
        }

        int i = 0;
        String currentWindow = s2.substring(i, s1.length() + i);

        // get keyvalue mapping in has2 for s2
        for (Character c : currentWindow.toCharArray()) {
            if (currentMap.containsKey(c)) {
                currentMap.put(c, currentMap.get(c) + 1);
            } else {
                currentMap.put(c, 1);
            }
        }

        // do a sliding window of size s1.length
        for (i = 0; i < s2.length() - s1.length(); i++) {
            // compare, if hash1 = has2 return true
            if (s1Map.equals(currentMap)) return true;

            currentMap.put(s2.charAt(i), currentMap.get(s2.charAt(i)) - 1);
            if (currentMap.get(s2.charAt(i)) == 0 ) currentMap.remove(s2.charAt(i));

            if (currentMap.containsKey(s2.charAt(i + s1.length()))) {
                currentMap.put(s2.charAt(i + s1.length()), currentMap.get(s2.charAt(i + s1.length())) + 1);
            } else {
                currentMap.put(s2.charAt(i + s1.length()), 1);
            }
        }

        if (s1Map.equals(currentMap)) return true;

        // return false at end if not found
        return false;
    }
}
