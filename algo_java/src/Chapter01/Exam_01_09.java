package Chapter01;

import java.util.Scanner;
/*
    https://cote.inflearn.com/contest/10/problem/01-09
 */
public class Exam_01_09 {
    public static int solution_1(String str){
        int answer = 0;
        /*
            String 내의 각 문자의 아스키코드 상으로 숫자라면,
            answer에 해당 숫자로 변환하여 넣음.
         */
        for(char c : str.toCharArray()){
            if(c >= 48 && c <= 57)
                answer = answer * 10 + (c - 48);
        }

        return answer;
    }

    public static int solution_2(String str){
        String answer = "";
        /*
            isDigit() : 주어진 문자가 숫자인 지 아닌 지를 반환.
         */
        for(char c : str.toCharArray()){
            if(Character.isDigit(c))
                answer += c;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution_1(str));
        System.out.println(solution_2(str));
    }
}
