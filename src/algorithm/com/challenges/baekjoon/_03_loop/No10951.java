package algorithm.com.challenges.baekjoon._03_loop;

import java.io.*;
import java.util.StringTokenizer;

public class No10951 {
    /**
     * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
     * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
     *
     * EOF 처리, ^D
     * https://www.acmicpc.net/problem/10951
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input, " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            bw.write(n + m + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
