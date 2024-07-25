package algorithm.com.challenges.baekjoon._04_1demArray;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No10871 {
    /**
     * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
     * https://www.acmicpc.net/problem/10871
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = in.nextInt();
        int findNum = in.nextInt();

        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = in.nextInt();
        }

        for(int i: arr){
            if(i<findNum){
                bw.write(i+" ");
            }
        }
        in.close();
        bw.flush();
        bw.close();
    }
}
