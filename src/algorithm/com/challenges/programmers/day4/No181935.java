package algorithm.com.challenges.programmers.day4;

public class No181935 {
    /**
     * n	result
     * 7	16
     * 10	220
     * https://school.programmers.co.kr/learn/courses/30/lessons/181935
     */
    public static void main(String[] args) {
        int answer = 0;
        int n=13;

        if(n%2 == 0){
            for(int i=1;i<=n; i++){
                if(i % 2 == 0){
                    answer += (i*i);
                }
            }
        }else{
            for(int i=1;i<=n; i++){
                if(i % 2 != 0){
                    answer += i;
                }
            }
        }

        System.out.println(answer);
    }
}
