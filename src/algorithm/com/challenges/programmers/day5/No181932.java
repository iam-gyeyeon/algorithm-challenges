package algorithm.com.challenges.programmers.day5;

public class No181932 {
    /**
     * code	result
     * "abc1abc1abc"	"acbac"
     * https://school.programmers.co.kr/learn/courses/30/lessons/181932
     */
    public static void main(String[] args) {
        String code = "";
        String answer = "";
        int mode = 0;

        for(int i=0; i<code.length(); i++){
            String c = code.charAt(i)+"";

            if(mode == 0){
                if(c.equals("1")){
                    mode = 1;
                }else{
                    if(i%2 == 0){
                        answer += c;
                    }
                }


            }else{
                if(c.equals("1")){
                    mode = 0;
                }else{
                    if(i%2 != 0){
                        answer += c;
                    }
                }
            }
        }
        System.out.println(answer.isEmpty() ? "EMPTY":answer);
    }
}
