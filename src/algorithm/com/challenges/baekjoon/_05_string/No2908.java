package algorithm.com.challenges.baekjoon._05_string;

import java.util.Scanner;

public class No2908 {
    /**
     * https://www.acmicpc.net/problem/2908
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        StringBuilder newA = new StringBuilder();
        StringBuilder newB = new StringBuilder();

        for(int i = a.length(); i>0; i--){
            newA.append(a.charAt(i - 1));
        }
        for(int i = b.length(); i>0; i--){
            newB.append(b.charAt(i - 1));
        }
        System.out.println(Integer.parseInt(String.valueOf(newA)) > Integer.parseInt(String.valueOf(newB)) ? newA: newB);
    }
}
