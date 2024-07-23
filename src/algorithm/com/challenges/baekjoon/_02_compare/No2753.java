package algorithm.com.challenges.baekjoon._02_compare;

import java.util.Scanner;

public class No2753 {

    /**
     *
     * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
     * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
     * https://www.acmicpc.net/problem/2753
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        boolean flag = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(flag ? "1" : "0");

    }
}
