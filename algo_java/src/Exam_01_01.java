import java.util.Scanner;

public class Exam_01_01 {
    public static int solution(String str, char c){
        int answer = 0;

        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        for(char target : str.toCharArray()){
            if(target == c)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char c = input.next().charAt(0);
        System.out.println(solution(str, c));
    }
}
