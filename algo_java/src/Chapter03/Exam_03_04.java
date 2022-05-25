package Chapter03;

import java.util.Scanner;

public class Exam_03_04 {
    public static int solution(int n, int m, int[] arr){
        // Left, Right의 두 개의 포인터를 두고 그 사이의 값들을 누적하여 비교한다.
        int answer = 0, sum = 0, lt = 0;

        // Left와 Right의 사이의 값들을 누적하여 비교.
        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];
            if(sum == m) answer++;

            /*
                누적 값이 찾으려는 값보다 크면 Left로 이동한다.
                While문을 사용하는 이유는 연속적으로 누적 값이 큰 경우가 있을 수 있기 때문이다.
             */
            while(sum >= m){
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        System.out.print(solution(n, m, arr));
    }
}
