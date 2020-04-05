package codegym.mon;

import java.util.Stack;

public class MainSymbolCheck {
    public static final char LEFT_SYMBOL = '(';
    public static final char RIGHT_SYMBOL = ')';
    public static final String original = "";
    Stack<Character> stack = new Stack<>();

    public void checkSymbol(String original, Stack<Character> stack) {
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == LEFT_SYMBOL) {
                stack.push((char) i);
            } else if (original.charAt(i) == RIGHT_SYMBOL) {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.push((char) i);
                }
            }
        }
    }
    public void checkTrueFalse(Stack<Character> stack) {
        if (stack.empty()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
