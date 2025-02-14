package algorithm.com.challenges.hanghae99;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Day18_begin {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            int absA = Math.abs(a);
            int absB = Math.abs(b);

            if(absA == absB){

                return Integer.compare(a, b);
            }
            return Integer.compare(absA, absB);
        });

        for(int i=0; i<count; i++) {
            int n = scanner.nextInt();

            if(n == 0){
                Integer p = pq.poll();
                sb.append(p == null ? 0: p).append("\n");
            }else{
                pq.add(n);
            }
        }
        System.out.println(sb);
    }
}
