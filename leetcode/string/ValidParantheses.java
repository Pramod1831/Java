package String;
import java.util.*;

class ValidParantheses {

    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                if(ch == ')'){
                    if(stack.peek() == '('){
                        stack.pop();
                    }else {
                        return false;
                    }
                }else if(ch == ']'){
                    if(stack.peek() == '['){
                        stack.pop();
                    }else {
                        return false;
                    }
                }else if(ch == '}'){
                    if(stack.peek() == '{'){
                        stack.pop();
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
                

            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Paraentheses");

        String str = sc.nextLine();

        ValidParantheses vp = new ValidParantheses();

        if(vp.isValid(str)){
            System.out.println("true");
        }else {
            System.out.println("False");
        }

        sc.close();
    }
}