package algorithm.com.challenges.baekjoon._03_loop;

import java.util.Scanner;

public class No25304 {
    /**
     * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
     * https://www.acmicpc.net/problem/25304
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int totalPrice = in.nextInt();
        int totalCount = in.nextInt();
        int checkPrice = 0;
        for(int i=0;i<totalCount;i++){
            int price = in.nextInt();
            int count = in.nextInt();
            checkPrice += price * count;
        }

        System.out.println(checkPrice == totalPrice ? "Yes" : "No");


    }
}
