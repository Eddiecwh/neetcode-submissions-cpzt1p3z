class Solution {

    public String encode(List<String> strs) {
        // str length is important
        // strs[i] < 200, meaning we can set length
        // as prefix to string e.g: 004abcd
        // add all strings to a master string
        // return master string
        String resultString = "";

        for (String str : strs) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%03d", str.length()));
            sb.append(str);
            resultString += sb;
        }

        return resultString;
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0, length = 0;

        while (i < str.length()) {
        length = Integer.parseInt(str.substring(i, i + 3));

        String currentString = str.substring(i + 3, i + 3 + length);

        result.add(currentString);

        i += length + 3;
        }

        return result;
    }
}
