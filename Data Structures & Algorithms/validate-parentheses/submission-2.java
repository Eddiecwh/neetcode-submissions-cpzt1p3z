class Solution {
    public boolean isValid(String s) {
        Stack<Character> newStack = new Stack<>();

        Map<Character, Character> reference = new HashMap<>();

        reference.put('}', '{');
        reference.put(']', '[');
        reference.put(')', '(');
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                newStack.push(s.charAt(i));
            } else {
                char closingBracket = reference.get(s.charAt(i));
                if (!newStack.isEmpty() && (newStack.peek() == closingBracket)) {
                    newStack.pop();
                } else {
                    return false;
                }
            }
        }

        return newStack.isEmpty();
    }
}
