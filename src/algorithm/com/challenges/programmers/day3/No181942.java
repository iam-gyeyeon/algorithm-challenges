package algorithm.com.challenges.programmers.day3;

public class No181942 {
    /**
     *  str1	str2	result
     * "aaaaa"	"bbbbb"	"ababababab"
     * https://school.programmers.co.kr/learn/courses/30/lessons/181942
     */
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String answer = "ababababab";
        for(int i=0; i<str1.length(); i++){
            answer += str1.charAt(i)+""+str2.charAt(i);
        }
        System.out.println(answer);
    }
}
