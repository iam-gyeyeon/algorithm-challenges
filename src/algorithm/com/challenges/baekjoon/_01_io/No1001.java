package algorithm.com.challenges.baekjoon._01_io;

import java.util.Scanner;

public class No1001 {
    /**
     * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
     * https://www.acmicpc.net/problem/1001
     */

    public static void main(String[] args) {
        int a=0;
        int b=0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a-b);
    }
}
