import java.util.Scanner;
/*
    https://cote.inflearn.com/contest/10/problem/01-08
 */
public class Exam_01_08 {
    public static String solution(String str){
        String answer = "NO";
        /*
            대소문자를 구별하지 않으므로, 문자열을 대문자로 바꾸고 알파벳이 아닌 문자는
            모두 공백으로 변환.
         */
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        /*
            문자열을 반전시켜서 저장하고, 원래 문자열과 비교하여 동일하면 결과를 YES로
            바꿈.
         */
        String temp = new StringBuilder(str).reverse().toString();

        if(str.equals(temp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution(str));
    }
}
