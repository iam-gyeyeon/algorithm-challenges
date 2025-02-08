package algorithm.com.challenges.hanghae99;

import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Day15_begin {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        while(true){
            String text = sc.nextLine();
            if(text.equals(".")){
                break;
            }
            if(checkSentence(text)){
                sb.append("yes").append("\n");
            }else{
                sb.append("no").append("\n");
            }

        }
        System.out.println(sb);
    }
    public static boolean checkSentence(String sentence){
        Stack<Character> stack = new Stack<>();
        boolean result = true;
        try {
            for (char c : sentence.toCharArray()) {
                if (c == '('|| c == '[') {
                    stack.push(c);
                }else if(c == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                       return false;
                    }else{
                        stack.pop();
                    }
                }
                else if(c == ']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        return false;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()){
                result = true;
            }else{
                result = false;
            }
        }catch(EmptyStackException e){
            return true;
        }


        return result;
    }
}
