package algorithm.com.challenges.programmers.day6;

public class No181927 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/181927
     */
    public static void main(String[] args) {
        int[] num_list = {};
        int[] answer = new int[num_list.length +1];

        int num = num_list[num_list.length-1] - num_list[num_list.length-2];
        int last_number = num > 0? num: num_list[num_list.length-1] * 2;

        for(int i=0; i<num_list.length; i++){
            answer[i]  = num_list[i];
            System.out.println(answer[i]);
        }
        answer[answer.length-1] = last_number;
        System.out.println("answer = " + answer);
    }
}
