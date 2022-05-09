package Chapter03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_03_01 {
    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while(p1 < n && p2 < m){
            if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }

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

        for(int i : solution(n, m, arr1, arr2)){
            System.out.print(i + " ");
        }
    }

}
