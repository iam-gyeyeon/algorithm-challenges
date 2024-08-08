package algorithm.com.challenges.programmers.day5;

public class No181928 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/181928
     */
    public static void main(String[] args) {
        int answer = 0;
        int num_list[] = {};
        StringBuilder odd_sum = new StringBuilder();
        StringBuilder even_sum = new StringBuilder();

        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 == 0) even_sum.append(num_list[i]+"");
            else odd_sum.append(num_list[i]+"");

        }
        System.out.println(Integer.parseInt(odd_sum.toString())+Integer.parseInt(even_sum.toString()));

    }
}
