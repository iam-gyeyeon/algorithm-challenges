package algorithm.com.challenges.baekjoon._05_string;

import java.util.Scanner;

public class No1152 {
    /**
     * https://www.acmicpc.net/problem/1152
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String convert = str.trim().replace("  ", " ");

        String[] split = convert.split(" ");
        int count = 0;
        for (String s : split) {
            if(!s.isEmpty()) count ++;
        }

        System.out.println(count);

    }
}
