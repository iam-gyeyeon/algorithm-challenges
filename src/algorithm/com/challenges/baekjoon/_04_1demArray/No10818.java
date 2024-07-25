package algorithm.com.challenges.baekjoon._04_1demArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10818 {
    /**
     * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
     * https://www.acmicpc.net/problem/10818
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        int min = list.stream().min(Integer::compareTo).get();
        int max = list.stream().max(Integer::compareTo).get();

        System.out.println(min + " " + max);

    }
}
