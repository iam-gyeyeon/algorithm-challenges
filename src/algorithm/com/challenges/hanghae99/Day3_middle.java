package algorithm.com.challenges.hanghae99;

import java.util.Scanner;

public class Day3_middle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int points = scanner.nextInt();
        int lines = scanner.nextInt();
        int[] pointList = new int[points];
        for(int i = 0; i < points; i++) {
            pointList[i] = scanner.nextInt();
        }

        for(int i = 0; i < lines; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int count = 0;
            for (int k : pointList) {
                if (start <= k && end >= k) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        scanner.close();
        System.out.println(sb.substring(0,sb.length()-1));
    }
}
