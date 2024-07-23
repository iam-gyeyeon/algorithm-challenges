package algorithm.com.challenges.baekjoon._01_io;

import java.util.Scanner;

public class No11382 {
    /**
     * 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
     * https://www.acmicpc.net/problem/11382
     */

    public static void main(String[] args) {

        long A=0L, B=0L, C=0L;

        Scanner in = new Scanner(System.in);
        A = in.nextLong();
        B = in.nextLong();
        C = in.nextLong();

        long total = A+B+C;
        System.out.println(total);
    }
}
