import java.util.Scanner;

public class Exam_01_11 {
    public static String solution(String str){
        String answer = "";
        str = str + " ";
        int count = 1;

        for(int i = 0; i < str.length() - 1; i++){
           if(str.charAt(i) == str.charAt(i + 1)) count++;

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
