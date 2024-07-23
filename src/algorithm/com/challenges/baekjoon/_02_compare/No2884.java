package algorithm.com.challenges.baekjoon._02_compare;

import java.util.Scanner;

public class No2884 {

    /**
     *  "45분 일찍 알람 설정하기"이다.
     * https://www.acmicpc.net/problem/2884
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int min = in.nextInt();

        if(min < 45){
            if(hour == 0){
                hour = 23;
            }else{
                hour = hour -1;
            }
            min = 60+min-45;
        }else{
            min = min-45;
        }
        System.out.println(hour + " " + min);
    }
}
