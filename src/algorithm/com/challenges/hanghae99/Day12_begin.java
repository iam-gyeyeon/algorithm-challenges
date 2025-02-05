package algorithm.com.challenges.hanghae99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Day12_begin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int size = Integer.parseInt(br.readLine());
        for(int i=0; i<size; i++) {
            int number = Integer.parseInt(br.readLine());
            while(!stack.isEmpty() && stack.peek() <=number) {
                stack.pop();
            }
            stack.push(number);
        }
        br.close();
        System.out.println(stack.size());
    }
}
