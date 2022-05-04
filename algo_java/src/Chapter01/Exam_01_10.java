package Chapter01;

import java.util.Scanner;
/*
    https://cote.inflearn.com/contest/10/problem/01-10
 */
public class Exam_01_10 {
    public static int[] solution(String str, char target){
        int[] answer = new int[str.length()];
        int position = 1000; // 임의의 최대값

        /*
            String을 순차탐색을 하며, 찾는 문자와 현재 인덱스의 문자가 일치하는 지를 확인함.
            일치하면 position 값을 0으로 하고, answer 배열에 position 값을 넣음.
            일치하지 않으면 postion 값을 증가시키고, answer 배열에 position 값을 넣음.
         */
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                position = 0;
                answer[i] = position;
            }

            else{
                position++;
                answer[i] = position;
            }
        }

        position = 1000;
        /*
            String을 역순탐색을 하며, 찾는 문자와 현재 인덱스의 문자가 일치하는 지를 확인함.
            일치하면 position 값을 0으로 하고, answer 배열에 position 값을 넣음.
            일치하지 않으면 position 값을 하나 증가시키고, 현재 answer 배열의 값과 position 값 중에 작은 값을
            answer 배열에 넣음.
         */
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == target) position = 0;

            else{
                position++;
                answer[i] = Math.min(answer[i], position);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char target = input.next().charAt(0);

        for(int result : solution(str, target)){
            System.out.print(result + " ");
        }
    }
}
