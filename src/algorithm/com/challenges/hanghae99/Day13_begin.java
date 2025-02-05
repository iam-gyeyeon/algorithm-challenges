package algorithm.com.challenges.hanghae99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Day13_begin {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i < size;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String action = st.nextToken();
            int result = actionQueue(queue, st, action);
            if(result != -9999){
                sb.append(result).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static int actionQueue(Queue<Integer> queue, StringTokenizer st, String action){
        int result = -9999;
        try{
            switch(action){
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    result = queue.element();
                    queue.remove(result);
                    break;
                case "size":
                    result = queue.size();
                    break;
                case "empty":
                    result = queue.isEmpty() ? 1: 0;
                    break;
                case "front":
                    result = queue.element();
                    break;
                case "back":
                    LinkedList<Integer> linkedListQueue = (LinkedList<Integer>)queue;
                    result = linkedListQueue.getLast();
                    break;
            }
        }catch(NoSuchElementException e){
            result = -1;
        }
        return result;
    }
}
