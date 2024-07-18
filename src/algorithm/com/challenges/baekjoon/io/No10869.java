package algorithm.com.challenges.baekjoon.io;

import java.util.Scanner;

public class No10869 {
    /**
     * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
     * https://www.acmicpc.net/problem/10869
     */
    public static void main(String[] args) {
        int a=0;
        int b=0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
