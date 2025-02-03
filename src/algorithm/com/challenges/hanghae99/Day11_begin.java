package algorithm.com.challenges.hanghae99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Day11_begin {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder builder = new StringBuilder();
        Stack<Integer> nowStack = new Stack<>();

        int count = Integer.parseInt(br.readLine());
        for(int i=0; i<count; i++) {
            int returnValue = -99999;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            try{
                if(order.equals("push")){
                    nowStack.push(Integer.parseInt(st.nextToken()));
                }else if(order.equals("pop")){
                    returnValue = nowStack.pop();
                }else if(order.equals("size")){
                    returnValue = nowStack.size();
                }else if(order.equals("empty")){
                    returnValue = nowStack.isEmpty() ? 1 : 0;
                }else if(order.equals("top")){
                    returnValue = nowStack.peek();
                }

            }catch(EmptyStackException e){
                returnValue = -1;
            }
            if(returnValue != -99999){
                builder.append(returnValue).append("\n");
            }
        }
        System.out.println(builder.substring(0, builder.length()-1));
    }
}
