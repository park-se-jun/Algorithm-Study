package Chapter02;

import java.util.Scanner;

public class Exam_02_09 {
    public static int solution(int n, int [][] arr){
        int answer = 0, sum_row, sum_col;

        /*
            각 행, 열의 합을 구한 다음에 최대 값을 찾음.
         */
        for(int i = 0; i < n; i++){
            sum_row = sum_col = 0;
            for(int j = 0; j < n; j++){
                sum_row += arr[i][j];
                sum_col += arr[j][i];
            }
            answer = Math.max(answer, sum_row);
            answer = Math.max(answer, sum_col);
        }

        /*
            대각선의 합을 구한 다음에 최대 값을 찾음.
         */

        sum_row = sum_col = 0;

        for(int i = 0; i < n; i++){
            sum_row += arr[i][i];
            sum_col += arr[i][n - i - 1];
        }

        answer = Math.max(answer, sum_row);
        answer = Math.max(answer, sum_col);

        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                arr[i][j] = input.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}
