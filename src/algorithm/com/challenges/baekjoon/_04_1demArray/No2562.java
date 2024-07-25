package algorithm.com.challenges.baekjoon._04_1demArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2562 {
    /**
     * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
     * https://www.acmicpc.net/problem/2562
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<9; i++){
            list.add(in.nextInt());
        }

        int max = list.stream().max(Integer::compareTo).get();
        int pos = list.indexOf(max);
        System.out.println(max);
        System.out.println(pos+1);

    }
}
