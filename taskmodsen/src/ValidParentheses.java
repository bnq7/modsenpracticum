import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{(})";
        System.out.println(isValid(s));
    }
}
