package algorithm.com.challenges.hanghae99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Day22_begin {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(st.nextToken());

        for(int i=0; i<testCase; i++) {
            bufferedReader.readLine();
            PriorityQueue<Integer> sQueue = new PriorityQueue<>();
            PriorityQueue<Integer> bQueue = new PriorityQueue<>();

            st = new StringTokenizer(bufferedReader.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(bufferedReader.readLine());
            for(int j=0; j<N; j++) {
                int sMember = Integer.parseInt(st.nextToken());
                sQueue.add(sMember);
            }

            st = new StringTokenizer(bufferedReader.readLine());
            for(int j=0; j<M; j++) {
                int bMember = Integer.parseInt(st.nextToken());
                bQueue.add(bMember);
            }

            while(!sQueue.isEmpty() && !bQueue.isEmpty()) { //둘 중 한 큐가 비어있으면 종료
                int sMember = sQueue.peek();
                int bMember = bQueue.peek();

                if(sMember == bMember) {
                    bQueue.poll();
                }else if(sMember < bMember) {
                    sQueue.poll();
                }else {
                    bQueue.poll();
                }
            }
            sb.append(sQueue.size() > bQueue.size() ? "S" : "B").append("\n");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
}
