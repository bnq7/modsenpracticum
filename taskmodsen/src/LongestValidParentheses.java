import java.util.ArrayDeque;
import java.util.Deque;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    res = Math.max(res, i - stack.peek());
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "((())))";
        System.out.println(longestValidParentheses(s));
    }
}