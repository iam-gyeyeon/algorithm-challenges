package algorithm.com.challenges.programmers.day2;

import java.util.Scanner;

public class No181944 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/181944
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String message = n%2 == 0 ? n+" is even": n+" is odd";
        System.out.println(message);
    }
}
