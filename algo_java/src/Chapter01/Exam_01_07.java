package Chapter01;

import java.util.Locale;
import java.util.Scanner;
public class Exam_01_07 {
    public static String solution_1(String str){
        String answer = "YES";
        str = str.toLowerCase();
        StringBuilder temp = new StringBuilder(str);
        if(!temp.reverse().toString().equals(str))
            answer = "NO";
        return answer;
    }

    public static String solution_2(String str){
        String answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution_1(str));
        //System.out.println(solution_2(str));
    }
}
