package algorithm.com.challenges.programmers.day5;

public class No181931 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/181931
     */
    public static void main(String[] args) {
        boolean[] included = {};
        int a = 0;
        int d = 0;
        int answer = 0;
        int result = a;
        for(int i=0; i<included.length; i++){
            if(included[i]){
                answer += result;
            }
            result += d;
        }
        System.out.println("answer = " + answer);
    }
}
