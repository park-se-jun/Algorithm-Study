package Chapter01;

import java.util.ArrayList;
import java.util.Scanner;
/*
    https://cote.inflearn.com/contest/10/problem/01-04
 */
public class Exam_01_04 {
    public static ArrayList<String> solution_1(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String s : str){
            String temp = new StringBuilder(s).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }

    public static ArrayList<String> solution_2(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String s : str){
            char[] c = s.toCharArray();
            /*
                좌측부터 우측으로 가는 인덱스, 우측에서 좌측으로 가는 인덱스를 두 개 사용한다.
                두 인덱스가 대칭될 때마다 문자열을 Swap 하는 방식으로 문자열 반전을 하도록 한다.
             */
            int lt = 0, rt = s.length() - 1;

            while(lt < rt){
                char temp_char = c[lt];
                c[lt] = c[rt];
                c[rt] = temp_char;
                lt++;
                rt--;
            }
            String temp_str = String.valueOf(c);
            answer.add(temp_str);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String[] str = new String[n];

        for(int i = 0; i < n; i++){
            str[i] = input.next();
        }

        for(String res : solution_1(n, str)){
            System.out.println(res);
        }

        for(String res : solution_2(n, str)){
            System.out.println(res);
        }
    }
}