package algorithm.com.challenges.hanghae99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day10_begin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        for(int i = 0; i < N; i++) {
            br.readLine();
            String[] numList = br.readLine().split(" ");

            for(String num : numList) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int answer = 0;
        for(String k : map.keySet()) {
            if(map.get(k) >= M) {
                answer ++;
            }
        }
        System.out.println(answer);
    }
}
