package algorithm.com.challenges.hanghae99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Day23_begin {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        // 입력 받기
        int n = Integer.parseInt(st.nextToken());// 작업의 수
        int m = Integer.parseInt(st.nextToken()); // 매일 감소하는 중요도
        int k = Integer.parseInt(st.nextToken()); // 최소 중요도

        // 작업의 중요도 입력
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(Integer.parseInt(st.nextToken()));
        }

        // 만족도 리스트
        List<Integer> satisfaction = new ArrayList<>();
        satisfaction.add(0); // 첫 날의 만족도

        // 작업 처리
        while (!pq.isEmpty()) {
            int today = pq.poll(); // 가장 높은 중요도 작업 꺼내기

            // 현재 날의 만족도 계산
            int currentSatisfaction = today + satisfaction.get(satisfaction.size() - 1) / 2;
            satisfaction.add(currentSatisfaction);

            // 중요도 감소
            today -= m;

            // 중요도가 k보다 크면 다시 큐에 추가
            if (today > k) {
                pq.add(today);
            }
        }

        // 결과 출력
        System.out.println(satisfaction.size() - 1); // 첫 날의 만족도는 제외
        for (int i = 1; i < satisfaction.size(); i++) {
            sb.append(satisfaction.get(i)).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
