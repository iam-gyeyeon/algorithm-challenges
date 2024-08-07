package algorithm.com.challenges.programmers.day4;

public class No181936 {
    /**
     * number	n	m	result
     * 60	2	3	1
     * 55	10	5	0
     * https://school.programmers.co.kr/learn/courses/30/lessons/181936
     */
    public static void main(String[] args) {
        int number = 60;
        int m = 3;
        int n = 2;
        int result = 0;

        result = (number % n == 0) && (number % m == 0) ? 1: 0;
        System.out.println("result = " + result);
    }
}
