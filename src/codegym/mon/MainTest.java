package codegym.mon;

import java.util.Scanner;
import java.util.Stack;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Enter Character is Checked: ");
        String inputCharacter = scanner.nextLine();

        MainSymbolCheck symbolCheck = new MainSymbolCheck();
        symbolCheck.checkSymbol(inputCharacter, stack);
        symbolCheck.checkTrueFalse(stack);
    }
}
