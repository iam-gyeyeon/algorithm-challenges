package algorithm.com.challenges.baekjoon._04_1demArray;

import java.io.IOException;
import java.util.Scanner;

public class No10807 {

    /**
     * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
     * https://www.acmicpc.net/problem/10807
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int size = in.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int find = in.nextInt();

        for(int i : arr){
            if(i == find){
                count ++;
            }
        }
        System.out.println(count);

    }
}
