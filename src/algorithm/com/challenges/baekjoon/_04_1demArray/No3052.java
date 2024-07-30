package algorithm.com.challenges.baekjoon._04_1demArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No3052 {
    /**
     * https://www.acmicpc.net/problem/3052
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> org = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<10; i++){
            int number = in.nextInt();
            org.add(number);
        }

        for (int i : org) {
            result.add(i%42);
        }
        System.out.println(result.stream().distinct().count());

    }
}
