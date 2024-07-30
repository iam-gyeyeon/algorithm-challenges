package algorithm.com.challenges.baekjoon._05_string;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No10809 {
    /**
     * https://www.acmicpc.net/problem/10809
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String[] alphabets = new String[26];
        char startAlphabet = 'a';
        for(int i=0; i<26; i++) {
            alphabets[i] = String.valueOf(startAlphabet);
            startAlphabet++;
        }


        for(int i=0; i<alphabets.length; i++) {
            bw.write(s.indexOf(alphabets[i])+" ");
        }
        in.close();
        bw.flush();
        bw.close();


    }
}
