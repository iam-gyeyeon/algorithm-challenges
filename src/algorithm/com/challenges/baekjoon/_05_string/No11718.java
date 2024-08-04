package algorithm.com.challenges.baekjoon._05_string;

import java.io.*;

public class No11718 {
    /**
     * https://www.acmicpc.net/problem/11718
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        String input = "";
        while ((input = br.readLine()) != null) {
            if(count >=100) break;
            bw.write(input + "\n");
            count++;
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
