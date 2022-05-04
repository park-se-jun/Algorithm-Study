package Chapter01;

import java.util.Scanner;
/*
    https://cote.inflearn.com/contest/10/problem/01-01
 */
public class Exam_01_01 {
    public static int solution(String str, char c){
        int answer = 0;

        /*
            대소문자 구별을 하지 않으므로, 입력 문자들을 모두
            소문자로 변환함.
         */
        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        for(char target : str.toCharArray()){
            if(target == c)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char c = input.next().charAt(0);
        System.out.println(solution(str, c));
    }
}
