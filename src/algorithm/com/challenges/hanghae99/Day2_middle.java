package algorithm.com.challenges.hanghae99;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2_middle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;

        //입력
        int size = in.nextInt();
        int n = in.nextInt();
        int[] lines = new int[size];

        for(int i = 0; i < size; i++) {
            lines[i] = in.nextInt();
        }

        //최대값(end) 찾기
        int start = 1;
        int end = 0;
        for (int line : lines) {
            if (end < line) {
                end = line; // end는 lines의 최대값으로 설정
            }
        }

        //이진탐색
        while(start < end) {
            int sum = 0;
            int mid = (start + end) / 2;
            for (int line : lines) {
                sum += line / mid; // mid로 나눈 몫을 합산
            }
            if(sum > n){
                start = mid + 1;
            }else if(sum < n){
                end = mid -1 ;
            }else{
                answer = mid;
                start = mid + 1;
            }
        }
        System.out.println(answer);
        in.close();
    }
}
