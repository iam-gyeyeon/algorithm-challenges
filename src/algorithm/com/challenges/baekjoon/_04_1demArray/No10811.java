package algorithm.com.challenges.baekjoon._04_1demArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No10811 {

    /**
     * https://www.acmicpc.net/problem/10811
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int count = in.nextInt();

        List<Integer> pocket = new ArrayList<>();
        for(int i=0; i<size; i++) {
            pocket.add(i+1);
        }
        for (int i = 0; i < count; i++) {
            int p = in.nextInt();
            int q = in.nextInt();

            Collections.reverse(pocket.subList(p-1,q));
        }

        pocket.forEach(p -> System.out.print(p + " "));

    }
}
