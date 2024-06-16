import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.swing.text.StyledEditorKit;

public class Valid_Parenthese {
public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>(3);

        bracketLookup.put(')', '(');
        bracketLookup.put('}', '{');
        bracketLookup.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (bracketLookup.containsKey(c)) {
                if (!brackets.isEmpty() && bracketLookup.get(c).equals(brackets.peek())) {
                    brackets.pop();
                } else {
                    return false;
                }
            } else {
                brackets.push(c);
            }
        }

        return brackets.isEmpty();
    }

    public static void main(String args[]){
        Valid_Parenthese p = new Valid_Parenthese();
        String St = "[({})]";
        boolean ch= p.isValid(St);
        if(ch == true){
            System.out.println("Valid");
        }
        else
            System.out.println("Not valid");
    }

}

