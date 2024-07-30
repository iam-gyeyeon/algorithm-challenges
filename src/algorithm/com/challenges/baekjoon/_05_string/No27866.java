package algorithm.com.challenges.baekjoon._05_string;

import java.util.Scanner;

public class No27866 {
    /**
     * https://www.acmicpc.net/problem/27866
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int pos = in.nextInt();

        System.out.println(s.charAt(pos-1));
        in.close();
    }
}
