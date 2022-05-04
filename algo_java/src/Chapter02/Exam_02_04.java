package Chapter02;

import java.util.Scanner;
public class Exam_02_04 {
    // 메모이제이션을 위한 메모리 공간.
    public static long[] temp;

    public static int[] solution_1(int n){
        int[] answer = new int[n];
        answer[0] = answer[1] = 1;

        for(int i = 2; i < n; i++)
            answer[i] = answer[i - 1] + answer[i - 2];

        return answer;
    }

    // 메모이제이션을 이용한 솔루션.
    public static long solution_2(int n){
        if(n <= 1) return n;

        else if(temp[n] != 0) return temp[n]; // 공간에 값이 있다면

        else { // 공간에 값이 없다면
            temp[n] = solution_2(n - 1) + solution_2(n - 2);
            return temp[n];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("Solution 1 : ");
        for(int i : solution_1(n))
            System.out.print(i + " ");

        System.out.println("\nSolution 2 : ");
        temp = new long[100];
        temp[0] = temp[1] = 1;
        solution_2(n);

        for(int i = 1; i <= n; i++)
            System.out.print(temp[i] + " ");
    }
}