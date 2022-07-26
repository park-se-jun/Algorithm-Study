package Chapter01;

import java.util.Scanner;
/*
    https://cote.inflearn.com/contest/10/problem/01-11
 */
public class Exam_01_11 {
    public static String solution(String str){
        String answer = "";
        // 임의로 공백 문자열 하나를 끝에 추가.
        str = str + " ";
        int count = 1;
        
        /*
            현재 문자의 다음 문자가 똑같으면 Count 값을 하나 증가.
         */
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)) count++;
            
           /*
                현재 문자가 다음 문자와 같지 않으면 카운팅을 멈추고 현재 인덱스의
                문자를 answer에 넣고, count 값이 1을 초과했으면 count 값도 answer에 넣어줌.
            */
            else{
                answer += str.charAt(i);
                if(count > 1) answer += String.valueOf(count);
                count=1;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution(str));
    }
}