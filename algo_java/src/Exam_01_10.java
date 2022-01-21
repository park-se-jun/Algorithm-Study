import java.util.Scanner;

public class Exam_01_10 {
    public static int[] solution(String str, char target){
        int[] answer = new int[str.length()];
        int position = 1000;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                position = 0;
                answer[i] = position;
            }

            else{
                position++;
                answer[i] = position;
            }
        }

        position = 1000;

        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == target) position = 0;

            else{
                position++;
                answer[i] = Math.min(answer[i], position);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char target = input.next().charAt(0);

        for(int result : solution(str, target)){
            System.out.print(result + " ");
        }
    }
}
