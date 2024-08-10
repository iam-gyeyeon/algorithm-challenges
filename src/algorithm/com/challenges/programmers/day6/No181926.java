package algorithm.com.challenges.programmers.day6;

public class No181926 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/181926
     */
    public static void main(String[] args) {
        String control = "wsdawsdassw";
        int n=0;
        for(int i=0; i<control.length(); i++){
            String c = control.charAt(i)+"";
            switch(c){
                case "w":
                    n += 1;
                    break;
                case "s":
                    n -= 1;
                    break;
                case "d":
                    n += 10;
                    break;
                case "a":
                    n -= 10;
                    break;
            }
        }
        System.out.println("n = " + n);
    }
}
