package algorithm.com.challenges.baekjoon._04_1demArray;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No10810 {
    /**
     * 공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
     * https://www.acmicpc.net/problem/10810
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] pocket = new int[N];
        for (int v = 0; v < M; v++) {
            int i=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();

            for(int start=i;start<=j;start++){
                pocket[start-1] = k;
            }
        }
        for(int p: pocket){
            bw.write(p+" ");
        }
        bw.flush();
        bw.close();
        sc.close();

    }
}
