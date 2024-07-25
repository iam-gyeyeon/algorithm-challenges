package algorithm.com.challenges.baekjoon._03_loop;

import java.io.*;

public class No2439 {
    /**
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
     *
     * https://www.acmicpc.net/problem/2439
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder star = new StringBuilder();

        for(int i = 1; i <= count; i++) {
            StringBuilder blank = new StringBuilder();

            star.append("*");
            blank.append(" ".repeat(count-i));
            bufferedWriter.write(blank.toString()+star.toString()+"\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
