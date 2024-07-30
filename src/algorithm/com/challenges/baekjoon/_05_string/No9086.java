package algorithm.com.challenges.baekjoon._05_string;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No9086 {
    /**
     * https://www.acmicpc.net/problem/9086
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cycle = in.nextInt();

        for(int i=0; i<cycle; i++) {
            String input = in.next();
            bw.write(input.charAt(0)+""+input.charAt(input.length()-1)+"\n");
        }
        bw.flush();
        bw.close();
        in.close();
    }
}
