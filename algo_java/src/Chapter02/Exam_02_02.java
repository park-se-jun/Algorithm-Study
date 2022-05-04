package Chapter02;

import java.util.Scanner;
public class Exam_02_02 {
    public static int solution(int n, int[] array){
        int answer = 1, max_high = array[0];

        for(int i = 1; i < n; i++){
            if(array[i] > max_high){
                max_high = array[i];
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] array = new int[n];

        for(int i = 0; i < n; i++)
            array[i] = input.nextInt();

        System.out.println(solution(n, array));
    }
}
