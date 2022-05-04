package Chapter02;

import java.util.Scanner;
public class Exam_02_03 {
    public static char[] solution(int n, int[] player_A, int[] player_B){
        char[] answer = new char[n];

        for(int i = 0; i < n; i++){
            switch (player_A[i] - player_B[i]){
                //A가 이기는 경우
                case -2 :
                case 1 : answer[i] = 'A'; break;

                //A가 지는 경우
                case -1 :
                case 2 : answer[i] = 'B'; break;

                default : answer[i] = 'D'; break;
            }
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

        for(char c : solution(n, player_A, player_B))
            System.out.println(c);
     }
}

