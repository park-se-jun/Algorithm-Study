package Chapter03;

import java.util.Scanner;

public class Exam_03_03 {
    public static int solution(int n, int k, int[] sales){
        int answer = 0;
        for(int i = 0; i < k; i++)
            answer += sales[i];

        int sum = answer;

        for(int j = k; j < n; j++) {
            sum += sales[j] - sales[j - k];
            if(answer < sum)
                answer = sum;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] sales = new int[n];

        for(int i = 0; i < n; i++)
            sales[i] = input.nextInt();

        System.out.println(solution(n, k, sales));
    }
}
