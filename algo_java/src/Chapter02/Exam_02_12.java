package Chapter02;

import java.util.Scanner;

public class Exam_02_12 {
    public static int solution(int n, int m, int [][] arr){
        int answer = 0;
        // n명의 학생이 m번의 테스트를 통해 나온 모든 경우의 수에 대해 탐색한다.
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++) {
                // 동일한 학생에 대한 결과는 탐색하지 않도록 한다.
                if (i != j) {
                    int cnt = 0;
                    // 각 테스트 안에서 학생들의 등수를 비교한다.
                    for (int k = 0; k < m; k++) {
                        int pi = 0, pj = 0;
                        for (int s = 0; s < n; s++) {
                            if (arr[k][s] == i) pi = s;
                            if (arr[k][s] == j) pj = s;
                        }
                        // i번 학생이 j번 학생보다 매번 등수가 높으면 짝이 될 수 있다.
                        if (pi < pj) cnt++;
                    }
                    /*
                        i번 학생과 j번 학생이 멘토와 멘티가 된 경우의 수가 테스트 횟수와 같다면
                        둘은 조건에 만족하는 짝이므로 전체 경우의 수를 증가시킨다.
                    */
                    if (cnt == m) answer++;

                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        int [][] arr = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++)
                arr[i][j] = input.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
