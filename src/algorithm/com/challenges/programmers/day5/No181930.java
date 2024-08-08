package algorithm.com.challenges.programmers.day5;

public class No181930 {
    /**
     * a	b	c	result
     * 2	6	1	9
     * 5	3	3	473
     * 4	4	4	110592
     * https://school.programmers.co.kr/learn/courses/30/lessons/181930
     */
    public static void main(String[] args) {
        int a = 0, b=0, c=0;
        int answer = 0;
        if(a!=b && b!=c && a!=c){
            answer = a+b+c;
        }else if((a!=b && b==c) || (a==b && b!=c) || (a==c && b!=c)){
            answer = (a+b+c) * (a*a + b*b + c*c);
        }else if(a==b && b==c){
            answer = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        System.out.println("answer = " + answer);
    }
}
