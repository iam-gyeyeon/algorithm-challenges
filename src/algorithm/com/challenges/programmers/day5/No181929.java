package algorithm.com.challenges.programmers.day5;

public class No181929 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/181929
     */

    public static void main(String[] args) {
        int[] num_list = {};
        int answer = 0;
        int sum = 0;
        int mul = 1;

        for(int i=0; i<num_list.length; i++){
            sum += num_list[i];
            mul *= num_list[i];
        }


        System.out.println(Math.pow(sum, 2) > mul ? 1 : 0);
    }
}
