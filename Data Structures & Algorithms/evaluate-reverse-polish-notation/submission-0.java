class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int operand = 0, operand2 = 0, operandResult = 0;

        for (String token : tokens) {
            if (token.equals("+")) {
                operand = stack.pop();
                operand2 = stack.pop();
                operandResult = operand2 + operand;
                stack.push(operandResult);
            } else if (token.equals("-")) {
                operand = stack.pop();
                operand2 = stack.pop();
                operandResult = operand2 - operand;
                stack.push(operandResult);
            } else if (token.equals("*")) {
                operand = stack.pop();
                operand2 = stack.pop();
                operandResult = operand2 * operand;
                stack.push(operandResult);
            } else if (token.equals("/")) {
                operand = stack.pop();
                operand2 = stack.pop();
                operandResult = operand2 / operand;
                stack.push(operandResult);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
    return stack.pop();
    }
}
