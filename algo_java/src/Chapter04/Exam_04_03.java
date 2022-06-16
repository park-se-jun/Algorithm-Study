package Chapter04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exam_04_03 {
    public static ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int lt = 0;

        for(int i = 0; i < k - 1; i++)
            hm.put(arr[i], hm.getOrDefault(arr[1], 0) + 1);

        for(int rt = k - 1; rt < n; rt++){
            hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1);
            answer.add(hm.size());
            hm.put(arr[lt], hm.get(arr[lt]) - 1);

            if(hm.get(arr[lt]) == 0) hm.remove(arr[lt]);

            lt++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        for(int j : solution(n, k, arr))
            System.out.print(j + " ");
    }
}
