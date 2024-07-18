package algorithm.com.challenges.baekjoon.io;

import java.util.Scanner;

public class No2588 {
    /**
     * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
     * https://www.acmicpc.net/problem/2588
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int pos1 = b % 10;
        int pos2 = (b / 10) %10;
        int pos3 = (b /100) % 100;

        System.out.println(a * pos1);
        System.out.println(a * pos2);
        System.out.println(a * pos3);

        System.out.println(a * pos1 + a * pos2 * 10 + a * pos3 * 100);
    }
}
