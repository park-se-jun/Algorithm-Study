package Chapter02;
import java.util.Scanner;
public class Exam_02_03 {
    public static char[] solution_1(int n, int[] player_A, int[] player_B){
        char[] answer = new char[n];

        for(int i = 0; i < n; i++){
            // 두 명의 공격이 정수로 표현되므로, 그 차이를 통해 승패를 알 수 있음.
            int temp = player_A[i] - player_B[i];

            switch(temp) {
                // A가 이기는 경우.
                case -2 :
                case 1 : answer[i] = 'A'; break;
                // B가 이기는 경우.
                case -1 :
                case 2 : answer[i] = 'B'; break;
                // 비기는 경우.
                default : answer[i] = 'D'; break;
            }
        }
        return answer;
    }

    public static String solution_2(int n, int[] player_A, int[] player_B){
        String answer = "";

        for(int i = 0; i < n; i++){
            // 비기는 경우.
            if(player_A[i] == player_B[i]) answer += "D";
                // 오직 A가 이기는 경우의 조건문.
            else if(player_A[i] == 1 && player_B[i] == 3) answer += "A";
            else if(player_A[i] == 2 && player_B[i] == 1) answer += "A";
            else if(player_A[i] == 3 && player_B[i] == 2) answer += "A";
                // 이 외의 조건들은 모두 B가 이기는 경우이다.
            else answer += "B";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] player_A = new int[n];
        int[] player_B = new int[n];

        for(int i = 0; i < n; i++)
            player_A[i] = input.nextInt();

        for(int j = 0; j < n; j++)
            player_B[j] = input.nextInt();

        for(char c : solution_1(n, player_A, player_B))
            System.out.println(c);

        for(char c : solution_2(n, player_A, player_B).toCharArray())
            System.out.println(c);
    }
}