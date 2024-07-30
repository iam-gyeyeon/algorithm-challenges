package algorithm.com.challenges.baekjoon._04_1demArray;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No5597 {
    /**
     * https://www.acmicpc.net/problem/5597
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> students = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            students.add(in.nextInt());
        }

        for(int i=1; i<= 30; i++){
            if(!students.contains(i)){
                bw.write(i+" ");
            }
        }
        in.close();
        bw.flush();
        bw.close();
    }
}
