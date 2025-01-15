package algorithm.com.challenges.baekjoon._06_deepening;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No2444 {
    /**
     * https://www.acmicpc.net/problem/2444
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        StringBuilder star = new StringBuilder();
        StringBuilder blank = new StringBuilder();

        for(int i=1; i<=count; i++) {
            System.out.println("i="+i);
//            star = new StringBuilder();
            blank = new StringBuilder();
            star.append("*");
            star.append("*".repeat(i-1));
            blank.append(" ".repeat(count-i));
            bw.write(blank.toString()+star.toString()+"\n");
            bw.flush();
        }

//        for(int i=count-1; i>=1; i--) {
//            star = new StringBuilder();
//            blank = new StringBuilder();
//
//            blank.append(" ".repeat(count-i));
//            star.append("*".repeat(i));
//            bw.write(blank.toString()+star.toString()+"\n");
//        }
        bw.flush();
        bw.close();
        in.close();
    }
}
