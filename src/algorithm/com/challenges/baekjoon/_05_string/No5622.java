package algorithm.com.challenges.baekjoon._05_string;

import java.util.Scanner;

public class No5622 {
    /**
     * https://www.acmicpc.net/problem/5622
     */
    public static void main(String[] args) {
        String[] dial = new String[]{"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            String character = s.charAt(i) + "";
            for (int j = 0; j < dial.length; j++) {

                if(dial[j].contains(character)) {
                    count += j+2;
                }
            }
        }
        System.out.println(count);

    }
}
