package algorithm.com.challenges.baekjoon._02_compare;

import java.util.Scanner;

public class No14681 {
    /**
     * 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
     * https://www.acmicpc.net/problem/14681
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if(x>0 && y>0){
            System.out.println("1");
        }else if(x<0 && y>0){
            System.out.println("2");
        }else if(x<0 && y<0){
            System.out.println("3");
        }else {
            System.out.println("4");
        }
    }
}
