package algorithm.com.challenges.baekjoon._03_loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No15552 {
    /**
     * https://www.acmicpc.net/problem/15552
     */

    /*comment*/
    /*BufferedReader와 BufferedWriter 에 익숙해질것*/
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for(int i=0; i<count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(a+b+"\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
