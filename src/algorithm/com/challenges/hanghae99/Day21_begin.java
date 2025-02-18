package algorithm.com.challenges.hanghae99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Day21_begin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int[] origin = new int[count];
        int[] sorted = new int[count];


        st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++) {
            int a = Integer.parseInt(st.nextToken());
            origin[i] = sorted[i] = a;
        }
        Arrays.sort(sorted);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int i=0;
        for(int a: sorted){
            if(!rankMap.containsKey(a)){
                rankMap.put(a, i++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int a: origin){
            sb.append(rankMap.get(a)).append("\n");
        }
        System.out.println(sb);
    }
}
