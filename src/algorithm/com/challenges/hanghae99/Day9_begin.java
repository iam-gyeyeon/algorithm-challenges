package algorithm.com.challenges.hanghae99;

import java.util.*;

public class Day9_begin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> titleMap = new HashMap<>();

        StringBuffer sb = new StringBuffer();
        int N = scanner.nextInt(); //알고있는 노래
        int M = scanner.nextInt(); //정답을 맞출

        for(int i=0; i<N; i++) {
            int titleSize = scanner.nextInt();
            String title = scanner.next();
            String notes = scanner.nextLine();
            titleMap.put(title, notes.substring(0,6) );
        }

        for(int i=0; i<M; i++) {
            String findNotes = scanner.nextLine();
            String returnTitle = "";
            int returnCount = 0;
            for(String title: titleMap.keySet()){
                String notes = titleMap.get(title);
                if(notes.trim().equals(findNotes)){
                    returnCount ++;
                    returnTitle = title;
                }
            }
            if(returnCount == 0){ sb.append("!").append("\n");}
            else if(returnCount == 1){sb.append(returnTitle).append("\n");}
            else {sb.append("?").append("\n");}
        }
        System.out.println(sb.substring(0, sb.length()-1));

    }
}
