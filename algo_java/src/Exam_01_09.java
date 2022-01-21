import java.util.Scanner;

public class Exam_01_09 {
    public static int solution_1(String str){
        int answer = 0;

        for(char c : str.toCharArray()){
            if(c >= 48 && c <= 57)
                answer = answer * 10 + (c - 48);
        }

        return answer;
    }

    public static int solution_2(String str){
        String answer = "";

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
