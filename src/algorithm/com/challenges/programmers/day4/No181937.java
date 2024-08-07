package algorithm.com.challenges.programmers.day4;

public class No181937 {
    /**
     * num	n	result
     * 98	2	1
     * 34	3	0
     * https://school.programmers.co.kr/learn/courses/30/lessons/181937
     */
    public static void main(String[] args) {
        int num = 98;
        int n = 2;
        
        int result = num%n == 0 ? 1 : 0;
        System.out.println("result = " + result);
    }
}
