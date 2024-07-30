package algorithm.com.challenges.baekjoon._05_string;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No2675 {
    /**
     * https://www.acmicpc.net/problem/2675
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = in.nextInt();

        for(int i=0; i<count; i++) {
            int loop = in.nextInt();
            String text = in.next();

            for(int j=0; j<text.length(); j++) {
                String split = String.valueOf(text.charAt(j));
                bw.write(split.repeat(loop));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        in.close();
    }
}
