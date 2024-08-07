package algorithm.com.challenges.programmers.day3;

public class No181941 {
    /**
     * arr	            result
     * ["a","b","c"]	"abc"
     * https://school.programmers.co.kr/learn/courses/30/lessons/181941
     */

    public static void main(String[] args) {
        String result = "";
        String[] arr = {"a","b","c"};
        for(int i=0;i<arr.length;i++) {
            result+=arr[i];
        }
        System.out.println("result = " + result);
    }

}
