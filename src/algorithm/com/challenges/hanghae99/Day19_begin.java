package algorithm.com.challenges.hanghae99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Day19_begin {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int N = Integer.parseInt(st.nextToken()); //손님
        int M = Integer.parseInt(st.nextToken()); //초밥 개수

        for(int i=0; i<M; i++){
            String[] sushiList = br.readLine().split(" ");
            for(int j=0; j<sushiList.length;j++){
                System.out.println(sushiList[j]);
            }
        }

        String[] menuList = br.readLine().split(" ");
    }
}
