package Chapter02;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam_02_01 {
    public static ArrayList<Integer> solution(int n, int[] array){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(array[0]);

        for(int i = 1; i < n; i++) {
            if(array[i] > array[i - 1]){
                answer.add(array[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++)
            array[i] = input.nextInt();

        for(int i : solution(n, array))
            System.out.print(i + " ");
    }
}
