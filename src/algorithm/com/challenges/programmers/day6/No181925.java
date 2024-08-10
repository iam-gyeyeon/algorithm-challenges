package algorithm.com.challenges.programmers.day6;

public class No181925 {
    /**
     *
     */
    public static void main(String[] args) {
        String answer = "";
        int numLog[] = {};

        for(int i=1; i<numLog.length; i++){
            int num = numLog[i] - numLog[i-1];

            if(num == 1){
                answer+= "w";
            }else if(num == -1){
                answer+= "s";
            }else if(num == 10){
                answer+= "d";
            }else if(num == -10){
                answer+= "a";
            }

        }
        System.out.println("answer = " + answer);
    }
}
