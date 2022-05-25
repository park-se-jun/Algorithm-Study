package Chapter03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_03_01 {
    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        // p1과 p2 중에 하나가 배열의 끝을 넘어가면 종료
        while(p1 < n && p2 < m){
            // p2가 큰 경우에만 p1의 값을 넣어준다.
            if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            // p1이 작거나 같은 경우에만 p2의 값을 넣어준다.
            else answer.add(arr2[p2++]);
        }

        // 배열에 남은 값을 처리해준다.
        while(p1 < n){
            answer.add(arr1[p1++]);
        }
        while(p2 < m ){
            answer.add(arr2[p2++]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];

        for(int i = 0; i < n; i++)
            arr1[i] = input.nextInt();

        int m = input.nextInt();
        int[] arr2 = new int[m];

        for(int j = 0; j < m; j++)
            arr2[j] = input.nextInt();

        for(int k : solution(n, m, arr1, arr2)){
            System.out.print(k + " ");
        }
    }

}
