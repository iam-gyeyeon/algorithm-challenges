package algorithm.com.challenges.programmers.day3;

public class No181939 {
    /**
     * a	b	result
     * 9	91	991
     * 89	8	898
     * https://school.programmers.co.kr/learn/courses/30/lessons/181939
     */
    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        int atob = Integer.parseInt(String.valueOf(a+""+b));
        int btoa = Integer.parseInt(String.valueOf(b+""+a));

        int answer = Math.max(atob, btoa);

        System.out.println(answer);
    }

}
