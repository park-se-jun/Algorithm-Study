import java.util.Scanner;

public class Exam_01_02 {
    public static String solution_1(String str){
        String answer = "";

        for(char c : str.toCharArray()){
            /*
                c가 아스키코드 65 ~ 90 사이라면 (= 대문자이면) 소문자로,
                아니라면 대문자로 변환
            */
            if(c >= 65 && c <= 90) answer += (char) (c + 32);
            else answer += (char) (c - 32);

        }

        return answer.toString();
    }

    public static String solution_2(String str){
        String answer = "";

        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution_1(str));
        System.out.println(solution_2(str));
    }
}
