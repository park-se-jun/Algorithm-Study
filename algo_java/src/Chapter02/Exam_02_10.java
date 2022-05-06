package Chapter02;

import java.util.Scanner;

public class Exam_02_10 {
    public static int solution(int n, int[][] map){
        int answer = 0;
        // X축 검사를 위한 배열
        int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
        // Y축 검사를 위한 배열
        int[] dy = {0, 1, 0, -1, -1, -1, 1, 1};

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                // 봉우리인 지를 나타내는 flag 변수
                boolean flag = true;
                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    // 경계선 필터링 및 상하좌우 값과 크기 비교
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] >= map[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] map = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                map[i][j] = input.nextInt();
        }

        System.out.println(solution(n, map));
    }
}
