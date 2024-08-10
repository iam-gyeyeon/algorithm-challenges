package algorithm.com.challenges.programmers.day6;

public class No181924 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/181924
     */
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4};
        int[][] queries = new int[][]{{0,3},{1,2},{1,4}};
        int[] answer = arr;

        for(int[] query : queries){
            int start = query[0];
            int end = query[1];

            for(int i=0; i<arr.length; i++){
                if(i==start){
                    int tmp = arr[start];
                    answer[start] = arr[end];
                    answer[end] = tmp;
                }
            }
        }
        System.out.println(answer);
    }
}
