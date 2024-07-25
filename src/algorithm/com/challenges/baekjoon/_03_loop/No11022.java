package algorithm.com.challenges.baekjoon._03_loop;

import java.io.*;
import java.util.StringTokenizer;

public class No11022 {
    /**
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
     * https://www.acmicpc.net/problem/11022
     */

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int count = Integer.parseInt(br.readLine());

            for(int i = 1; i <= count; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                bw.write("Case #"+i+": "+a + " + " + b +" = "+(a+b)+"\n");
            }
            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
