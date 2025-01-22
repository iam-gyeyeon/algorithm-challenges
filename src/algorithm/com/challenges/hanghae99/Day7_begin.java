package algorithm.com.challenges.hanghae99;

import java.util.*;

public class Day7_begin {
    public static void main(String[] args) {
        Long answer = 0L;
        Map<Character, Integer> alphaMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<26; i++) {
            alphaMap.put((char)(97+i), (i+1));
        }

        int N = sc.nextInt();
        String alpha = sc.next();

        for(int i=0; i<alpha.length(); i++) {
            char ch = alpha.charAt(i);
            answer = (long) (answer + alphaMap.get(ch) * Math.pow(31,i));
        }
        sc.close();
        System.out.println(answer % 1234567891);
    }
}
