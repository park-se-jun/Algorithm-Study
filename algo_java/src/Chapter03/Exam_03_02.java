package Chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam_03_02 {
    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // p1과 p2 중에 하나가 배열의 끝을 넘어가면 종료
        while(p1 < n && p2 < m){
            if(arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            }
            // 두 배열이 정렬되어 있으니 첫 번째 배열의 값이 작으면 다음 값으로 넘어감
            else if(arr1[p1] < arr2[p2]) p1++;
            else p2++;
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

        for(int i : solution(n, m, arr1, arr2))
            System.out.print(i + " ");
    }
}