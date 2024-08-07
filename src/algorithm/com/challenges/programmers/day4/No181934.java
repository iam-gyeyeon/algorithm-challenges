package algorithm.com.challenges.programmers.day4;

public class No181934 {
    /**
     * 
     */
    public static void main(String[] args) {
        int answer = 0;
        String ineq = ">"; 
        String eq = "=";
        int n = 3;
        int m = 4;
        if(ineq.equals(">") && eq.equals("=")){
            answer = n>=m ? 1: 0;
        }else if(ineq.equals(">") && eq.equals("!")){
            answer = n>m ? 1: 0;
        }else if(ineq.equals("<") && eq.equals("=")){
            answer = n<=m ? 1: 0;
        }else if(ineq.equals("<") && eq.equals("!")){
            answer = n< m ? 1: 0;
        }
        System.out.println("answer = " + answer);

    }
}
