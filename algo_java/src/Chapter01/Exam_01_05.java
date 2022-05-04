package Chapter01;

import java.util.Scanner;
/*
    https://cote.inflearn.com/contest/10/problem/01-05
 */
public class Exam_01_05 {
    public static String solution(String str){
        String answer = "";
        /*
            좌측부터 우측으로 가는 인덱스, 우측에서 좌측으로 가는 인덱스를 두 개 사용한다.
            두 인덱스가 대칭될 때마다 문자열을 Swap 하는 방식으로 문자열 반전을 하도록 한다.
            (Swap의 대상이 되는 두 문자가 알파벳일 때 Swap 하도록 한다.)
        */
        int lt = 0, rt = str.length() - 1;
        char[] temp_arr = str.toCharArray();

        while(lt < rt){
            if(!Character.isAlphabetic(temp_arr[lt])) lt++;

            else if(!Character.isAlphabetic(temp_arr[rt])) rt++;

            else {
                char temp = temp_arr[lt];
                temp_arr[lt] = temp_arr[rt];
                temp_arr[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(temp_arr);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution(str));
    }
}
