package algorithm.com.challenges.baekjoon._02_compare;

import java.util.Scanner;

public class No2480 {

    /**
     * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
     *
     * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
     * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
     * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
     *
     * https://www.acmicpc.net/problem/2480
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int price = 0;

        if(a == b && a == c){
            price = 10000 + a * 1000;
        }else if(a==b || a==c){
            price = 1000 + a * 100;
        }else if(b==c){
            price = 1000 + b * 100;
        }else{
            price =Math.max(Math.max(a,b),c) * 100;
        }
        System.out.println(price);
    }
}
