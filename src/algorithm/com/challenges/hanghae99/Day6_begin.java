package algorithm.com.challenges.hanghae99;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day6_begin {
    public static void main(String[] args) {
        String[] fruits = {"STRAWBERRY", "BANANA","LIME","PLUM"};
        Map<String, Integer> fruitMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String answer = "NO";
        for (String s : fruits) {
            fruitMap.put(s, 0);
        }
        int N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            String fruit = scanner.next();
            int count = scanner.nextInt();
            fruitMap.put(fruit,fruitMap.getOrDefault(fruit,0)+count);
        }
        for (String fruit : fruits) {
            if (fruitMap.get(fruit) == 5) {
                answer = "YES";
                break;
            }
        }
        System.out.println(answer);
    }
}
