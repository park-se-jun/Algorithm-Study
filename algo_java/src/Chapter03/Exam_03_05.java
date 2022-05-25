package Chapter03;

import java.util.Scanner;

public class Exam_03_05 {
    // Two pointers
    public static int solution1(int n){
        int answer = 0, lt = 0, sum = 0;
        int m = n/2 + 1;
        int[] arr = new int[m];

        for(int i = 0; i < m; i++)
            arr[i] = i + 1;

        for(int rt = 0; rt < m; rt++){
            sum += arr[rt];
            if(sum == n) answer++;

            while(sum >= n){
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }
        return answer;
    }

    // 몫과 나머지를 이용한 풀이
    public static int solution2(int n){
        int answer = 0, count = 1;
        n--;
        while(n > 0){
            count++;
            n = n - count;
            if(n % count == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }
}
