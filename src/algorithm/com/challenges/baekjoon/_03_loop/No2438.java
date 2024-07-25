package algorithm.com.challenges.baekjoon._03_loop;

import java.io.*;

public class No2438 {
    /**
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     * https://www.acmicpc.net/problem/2438
     */
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int count = Integer.parseInt(bufferedReader.readLine());
            StringBuilder star = new StringBuilder();
            for(int i = 0; i < count; i++) {
                star.append("*");
                bufferedWriter.write(star.toString()+"\n");
            }
            bufferedReader.close();

            bufferedWriter.flush();
            bufferedWriter.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
