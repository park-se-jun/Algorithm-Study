package Chapter02;

import java.util.Scanner;

public class Exam_02_11 {
    public static int solution(int n, int [][] student){
        int answer = 0, max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= 5; k++){
                    // 같은 반이었던 적이 한번이라도 있다면 한번만 카운팅하고 넘어가야함.
                    if(student[i][k] == student[j][k]){
                        cnt++;
                        break;
                    }
                }
            }

            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] student = new int[n + 1][6];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 5; j++){
                student[i][j] = input.nextInt();
            }
        }

        System.out.println(solution(n, student));
    }
}
