package Chapter04;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Exam_04_05 {
    public static int solution(int[] arr, int n, int k){
        int answer = -1;
        int cnt = 0;

        //내림차순 정렬을 하는 Tree set 선언
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int l = j + 1; l < n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        for(int x : Tset){
            cnt++;
            if(cnt == k) return x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(solution(arr, n, k));
    }
}
