package algorithm.com.challenges.hanghae99;

import java.util.*;

public class Day8_begin {
    public static void main(String[] args) {
        List<String> ingredients = new ArrayList<>();
        Map<String, Integer> usedMap = new HashMap<>();

        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 1; i <= N; i++) {
            String ingredient = scanner.next();
            ingredients.add(ingredient);
        }

        for(int i=0; i<N-1; i++){
            String useIngredients = scanner.next();
            usedMap.put(useIngredients,i);
        }

        for (String ingredient : ingredients) {
            if (!usedMap.containsKey(ingredient)) {
                sb.append(ingredient);
                break;
            }
        }
        scanner.close();
        System.out.println(sb.toString());
    }
}
