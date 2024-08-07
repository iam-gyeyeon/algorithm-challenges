package algorithm.com.challenges.programmers.day4;

public class No181933 {
    /**
     * a	b	flag	result
     * -4	7	true	3
     * -4	7	false	-11
     * https://school.programmers.co.kr/learn/courses/30/lessons/181933
     */
    public static void main(String[] args) {
        int answer = 0;
        boolean flag = false;
        int a = -4, b=7;
        answer = flag == true ? a+b : a-b;
        System.out.println("answer = " + answer);
    }
}
