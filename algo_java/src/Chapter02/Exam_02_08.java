package Chapter02;

import java.util.Scanner;

public class Exam_02_08 {
    public static int[] solution(int n, int [] arr){
        int[] answer = new int[n];
        /*
            2중 for loop를 수행하면서, 등수를 계산하도록 한다.
         */
        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = 0; j < n; j++){
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        for(int i : solution(n, arr))
            System.out.print(i + " ");
    }
}
