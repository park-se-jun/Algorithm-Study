import java.util.Scanner;

public class Exam_01_08 {
    public static String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
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
