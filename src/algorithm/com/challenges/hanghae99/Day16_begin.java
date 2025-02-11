package algorithm.com.challenges.hanghae99;

import java.util.PriorityQueue;

//프로그래머스 더맵게
//https://school.programmers.co.kr/learn/courses/30/lessons/42626
public class Day16_begin {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int s: scoville){
            pq.add(s);
        }

        while(pq.peek()<K){

            if(pq.size() == 1){
                break;
            }

            pq.add(pq.poll() + (pq.poll() * 2));
            answer ++;
        }

        System.out.println(answer);
    }
}
