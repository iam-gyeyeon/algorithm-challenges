package algorithm.com.challenges.baekjoon._03_loop;

import java.util.Scanner;

public class No25314 {
    /**
     * 만약, 입출력이 N바이트 크기의 정수라면 프로그램을 어떻게 구현해야 할까요?”
     * https://www.acmicpc.net/problem/25314
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int byteCheck = n%4 == 0 ? n/4 : n/4+1;
        StringBuilder result = new StringBuilder();
        for(int i=0; i<byteCheck; i++){
            result.append("long ");
        }

        System.out.println(result+"int");
        in.close();
    }
}
