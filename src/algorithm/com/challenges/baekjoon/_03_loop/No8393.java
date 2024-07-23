package algorithm.com.challenges.baekjoon._03_loop;

import java.util.Scanner;

public class No8393 {
    /**
     * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
     * https://www.acmicpc.net/problem/8393
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        for(int i=0; i<n; i++) {
            result +=(i+1);
        }
        System.out.println(result);
        in.close();
    }
}
