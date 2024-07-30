package algorithm.com.challenges.baekjoon._04_1demArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No1546 {
    /**
     * https://www.acmicpc.net/problem/1546
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        List<Integer> subject = new ArrayList<>();
        for(int i=0; i<count; i++){
            subject.add(in.nextInt());
        }

        int maxGoal = subject.stream().max(Integer::compareTo).get();
        double sum = 0.0;
        List<Double> newSubject = new ArrayList<>();
        for (Integer i : subject) {
            double result = ((double) i /maxGoal)*100;
            sum += result;
            newSubject.add(result);
        }
        System.out.println(sum/count);

    }
}
