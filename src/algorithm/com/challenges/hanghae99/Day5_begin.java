package algorithm.com.challenges.hanghae99;

import java.util.List;
import java.util.Scanner;

public class Day5_begin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[][] arrList = new String[5][15];
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<5; i++){
            String[] splitArr = in.nextLine().split("");
            for(int j=0; j<splitArr.length; j++){
                arrList[i][j] = splitArr[j];
            }
        }

        for(int j=0; j<15; j++){
           for(int i=0; i<5; i++){
               if(arrList[i][j]!=null){
                   sb.append(arrList[i][j]);
               }
           }
        }
        in.close();
        System.out.println(sb);

    }
}
