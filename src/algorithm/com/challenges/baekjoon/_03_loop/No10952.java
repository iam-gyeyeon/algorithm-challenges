package algorithm.com.challenges.baekjoon._03_loop;

import java.io.*;
import java.util.StringTokenizer;

public class No10952 {
    /**
     * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
     * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
     * 입력의 마지막에는 0 두 개가 들어온다.
     * https://www.acmicpc.net/problem/10952
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(n == 0 && m == 0){
                break;
            }
            bw.write(n+m+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
