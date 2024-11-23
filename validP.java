import java.util.Stack;

public class validP {
    public static boolean valid(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chr = str.toCharArray();

        for (char ch : chr) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char temp = stack.pop();
                if ((ch == ')' && temp != '(') || (ch == '}' && temp != '{') || (ch == ']' && temp != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String st = "[{()}]";
        if (valid(st)) {
            System.out.println("The string has valid parentheses.");
        } else {
            System.out.println("The string has invalid parentheses.");
        }
        String st2 = "[{(})]";
        if (valid(st2)) {
            System.out.println("The string has valid parentheses.");
        } else {
            System.out.println("The string has invalid parentheses.");
        }
    }
}
