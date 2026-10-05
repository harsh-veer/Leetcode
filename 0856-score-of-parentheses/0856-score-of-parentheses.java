class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(0);
            } else {
                int inside = stack.pop();
                int score = (inside == 0) ? 1 : 2 * inside;

                int previous = stack.pop();
                stack.push(previous + score);
            }
        }

        return stack.pop();
    }
}