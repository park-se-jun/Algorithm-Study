package Chapter01;

import java.util.Scanner;
public class Exam_01_07 {
    public static String solution_1(String str){
        String answer = "YES";
        str = str.toLowerCase();
        int len = str.length();

        /*
            String의 절반까지 인덱스를 증가시키면서, 가장 끝과 끝의 인덱스을
            점점 좁혀오면서 비교.
         */
        for(int i = 0; i < len / 2; i++){
            if(str.charAt(i) != str.charAt(len - i - 1)){
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static String solution_2(String str){
        String answer = "YES";
        /*
            검사할 문자열을 반전시켜서 동일한 지 아닌 지를 검사함.
         */
        String temp_str = new StringBuilder(str).reverse().toString();

        // IgnoreCase : 대소문자 무시
        if(!str.equalsIgnoreCase(temp_str))
            answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution_1(str));
        System.out.println(solution_2(str));
    }
}
