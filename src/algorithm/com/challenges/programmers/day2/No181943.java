package algorithm.com.challenges.programmers.day2;

public class No181943 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/181943
     */
    public static void main(String[] args) {
        String my_string = "Program29b8UYP";
        String overwrite_string = "merS123";
        StringBuilder result = new StringBuilder();
        int s = 7;

        for(int i=0; i<s; i++){
            result.append(my_string.charAt(i));
        }
        System.out.println("result = "+result);
        for(int i = 0; i < overwrite_string.length(); i++) {
            result.append(overwrite_string.charAt(i));
        }
        System.out.println("result = "+result);

        for(int i=s+overwrite_string.length(); i<my_string.length(); i++) {
            result.append(my_string.charAt(i));
        }
        System.out.println("result = "+result);


        System.out.println(result);
    }
}
