package algorithm.com.challenges.hanghae99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Day20_begin {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        LinkedHashMap<String, Integer> linkmap = new LinkedHashMap<>();

        for(int i=0;i<count;i++){

            String[] fileName = br.readLine().split("\\.");
            linkmap.put(fileName[1], linkmap.getOrDefault(fileName[1], 0)+1);
        }

        TreeMap<String, Integer> map = new TreeMap<>(linkmap);

        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
