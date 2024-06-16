import java.util.Stack;
import java.util.*;

class ValidParentheses{
    public boolean isValid(String s){
        Stack <Character> stack = new Stack<Character>();
        char ch [] = s.toCharArray();
        for(int i = 0 ; i < ch.length ; i++) {
            if(ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
                stack.add(ch[i]);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }

            char check;
            switch (ch[i]) 
            {

                

                case ')':
                    check = stack.pop();
                    if(check == '(')
                        return true;
                    break;

                case '}':
                    check = stack.pop();
                    if(check == '{')
                        return true;
                    break;

                case ']':
                    check = stack.pop();
                    if(check == '[')
                        return true;
                    break;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        String st = "[(])";


        ValidParentheses p = new ValidParentheses();
        boolean check = p.isValid(st);
        if(check == true){
            System.out.println("Valid Parenthesis");
        }
        else
            System.out.println("Not Valid");

    }

}