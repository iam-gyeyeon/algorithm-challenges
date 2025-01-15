package algorithm.com.challenges.hanghae99;

import java.io.IOException;
import java.util.Scanner;

public class Day2_begin {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = "";
        while(sc.hasNext()) {
            sb.append(sc.nextLine());

            if(sc.hasNext()){
                sb.append("\n");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
