package Chapter02;
import java.util.Scanner;

public class Exam_02_04 {
    public static int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = answer[1] = 1;

        for (int i = 2; i < n; i++)
            answer[i] = answer[i - 1] + answer[i - 2];
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i : solution(n))
            System.out.print(i + " ");
    }
}
