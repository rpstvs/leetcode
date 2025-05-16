package java.ValidParentheses;

import java.util.Arrays;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack[++top] = ')';
            } else if (ch == '{') {
                stack[++top] = '}';
            }

            else if (ch == '[') {
                stack[++top] = ']';
            } else {
                if (top == -1 || s.charAt(i) != stack[top]) {
                    return false;
                }
                top--;
            }

        }
        return top == -1;
    }
}
