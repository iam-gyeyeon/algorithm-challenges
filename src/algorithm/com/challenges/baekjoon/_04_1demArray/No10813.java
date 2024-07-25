package algorithm.com.challenges.baekjoon._04_1demArray;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No10813 {
    /**
     * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
     * 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
     * 도현이는 입력으로 주어진 순서대로 공을 교환한다.
     * https://www.acmicpc.net/problem/10813
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = in.nextInt();
        int M = in.nextInt();

        int[] pocket = new int[N];
        for(int i=0; i<N; i++){
            pocket[i] = i+1;
        }


        for (int i = 0; i < M; i++) {
            int tmp = 0;

            int x = in.nextInt();
            int y = in.nextInt();

            tmp = pocket[x-1];
            pocket[x-1] = pocket[y-1];
            pocket[y-1] = tmp;

        }

        for(int i:pocket){
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
        in.close();


    }
}
