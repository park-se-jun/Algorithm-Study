package Chapter02;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam_02_06 {
    public static boolean isPrime(int n){
        if(n == 1) return false;
        /*
            2부터 n까지 배수로 나누어진다면 소수가 아님.
         */
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }

        return true;
    }

    public static ArrayList<Integer> solution(int n, int[] array){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int temp = array[i];
            int res = 0;

            /*
                일의 자리 -> 십의 자리 -> 백의 자리 -> ... 순으로
                숫자를 누적하여 반전시킴.
             */
            while(temp > 0){
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }

            if(isPrime(res)) answer.add(res);
        }
        return  answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++)
            array[i] = input.nextInt();

        for(int j : solution(n, array))
            System.out.print(j + " ");

    }
}