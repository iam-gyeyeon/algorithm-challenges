package algorithm.com.challenges.hanghae99;

import java.util.Scanner;

public class Day3_begin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int count = in.nextInt();

        for(int i=0; i<count; i++) {
            int loop = in.nextInt();
            String str = in.nextLine();

            for(String s: str.trim().split("")) {
                sb.append(s.repeat(loop));
            }
            sb.append("\n");
        }
        System.out.println(sb);
        in.close();
        
    }
}
