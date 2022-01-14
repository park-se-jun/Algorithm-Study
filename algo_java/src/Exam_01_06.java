import java.util.Scanner;

public class Exam_01_06 {
    public static String solution_1(String str){
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static String solution_2(String str){
        String answer = "";

        for(char c : str.toCharArray()){
            if(answer.indexOf(c) == -1){
                answer += c;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution_1(str));
        System.out.println(solution_2(str));
    }
}
