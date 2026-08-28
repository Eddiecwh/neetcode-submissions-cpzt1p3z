class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length() + "#" + str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        // 5#hello5#world

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int hashPos = str.indexOf('#', i);
            int wordLength = Integer.parseInt(str.substring(i, hashPos));
            String word = str.substring(hashPos + 1, hashPos + wordLength + 1);

            result.add(word);
            
            i = hashPos + wordLength + 1;
        }
        
        return result;
    }
}
