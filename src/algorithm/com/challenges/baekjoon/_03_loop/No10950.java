package algorithm.com.challenges.baekjoon._03_loop;

import java.util.Scanner;

public class No10950 {
    /**
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     * https://www.acmicpc.net/problem/10950
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            int x = in.nextInt();
            int y = in.nextInt();

            arr[i] = x+y;
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
}
