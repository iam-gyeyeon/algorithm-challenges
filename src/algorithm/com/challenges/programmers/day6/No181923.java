package algorithm.com.challenges.programmers.day6;

import java.util.Collections;
import java.util.*;
import java.util.stream.IntStream;

public class No181923 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/181923
     */
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,4,3};
        int[][] queries = new int[][]{{0,4,2}, {0,3,2},{0,2,2}};

        int[] answer = new int[queries.length];

        int answerIdx = 0;
        for(int[] query: queries){
            int start = query[0];
            int end = query[1];
            int k = query[2];
            int min = 0;

            List<Integer> tempList = new ArrayList<>();
            for (int i = start; i <= end; i++) {

                if (arr[i] > k) {
                    tempList.add(arr[i]);
                }
            }
            if(tempList.size() > 0){
                min = Collections.min(tempList);
            }else{
                min = -1;
            }
            answer[answerIdx++] = min;
        }
    }
}
