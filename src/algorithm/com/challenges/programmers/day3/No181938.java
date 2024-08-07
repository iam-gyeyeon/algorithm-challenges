package algorithm.com.challenges.programmers.day3;

public class No181938 {
    /**
     * a	b	result
     * 2	91	364
     * 91	2	912
     * https://school.programmers.co.kr/learn/courses/30/lessons/181938
     */
    public static void main(String[] args) {
        int a = 91;
        int b = 2;
        int answer = 0;

        int atob = Integer.parseInt(a+""+b);
        int calculate = 2*a*b;

        answer = Math.max(atob, calculate);
        System.out.println("answer = " + answer);
    }
}
