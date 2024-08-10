package algorithm.com.challenges.baekjoon._06_deepening;

import java.util.Arrays;
import java.util.Scanner;

public class No3003 {
    /**
     * https://www.acmicpc.net/problem/3003
     */
    public static void main(String[] args) {
        int[] standard = new int[]{1, 1, 2, 2, 2, 8};
        int[] result = new int[standard.length];


        Scanner sc = new Scanner(System.in);

        for(int i=0; i<standard.length; i++) {
            int a = sc.nextInt();
            result[i] = standard[i]-a;
        }


       Arrays.stream(result).forEach(n->System.out.print(n+" "));


    }
}
