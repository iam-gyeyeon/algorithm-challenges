package algorithm.com.challenges.baekjoon._05_string;

import java.util.Scanner;

public class No11720 {
    /**
     * https://www.acmicpc.net/problem/11720
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int sum = 0;
        
        String num = in.next();
        
        for(int i=0; i<count; i++){
            int c = Integer.parseInt(String.valueOf(num.charAt(i)));
            sum+=c;
        }
        System.out.println(sum);
    }
}
