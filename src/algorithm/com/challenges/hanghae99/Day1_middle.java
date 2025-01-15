package algorithm.com.challenges.hanghae99;

import java.util.*;

public class Day1_middle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int note1Size = sc.nextInt();
            Set<Integer> note1Set = new HashSet<>();
            for(int i=0; i<note1Size; i++) {
                note1Set.add(sc.nextInt());
            }
            int note2Size = sc.nextInt();
            StringBuilder result = new StringBuilder();

            for(int i=0; i<note2Size; i++) {
                int note2 = sc.nextInt();
                if(note1Set.contains(note2)) {
                    result.append(1).append("\n");
                }else{
                    result.append(0).append("\n");
                }
            }
            System.out.println(result.substring(0, result.length() - 1));

        }
        sc.close();
    }
}
