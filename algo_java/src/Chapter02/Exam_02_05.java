package Chapter02;

import java.util.Scanner;

public class Exam_02_05 {
    public static int solution(int n){
        int answer = 0;
        /*
            인덱스를 숫자로 대체하고, 숫자 1부터 N까지의 소수 여부를
            나타내기 위해 N+1 크기의 배열을 생성함.

            0이면 소수이고, 1이면 소수가 아님.
         */
        int[] check = new int[n + 1];

        // 1은 소수가 아니므로, 2부터 소수인지를 판별함.
        for(int i = 2; i <= n; i++){
            if(check[i] == 0) {
                answer++;
                // i번째 수가 소수이면, 이후의 배수를 모두 소수가 아닌 것으로 변경함.
                for(int j = i; j <= n; j = j+i)
                    check[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}