package Chapter01;

import java.util.Scanner;
public class Exam_01_12 {
    public static String solution(int n, String str){
        String answer = "";
        /*
            n개의 문자를 잘라야하므로, n번 반복하는 반복문을 수행함.
         */
        for(int i = 0; i < n; i++){
            // 7개의 문자를 잘라서 #은 1로, *은 0으로 변환.
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            // 2진수를 10진수로 변환.
            int num = Integer.parseInt(temp, 2);
            // 10진수로 바뀐 정수를 char로 캐스팅하여 answer에 누적.
            answer += (char)num;
            // 다음 문자를 추출하기 위해 8번째 문자를 시작으로 문자열의 끝까지 추출하여 str에 저장.
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next();
        System.out.println(solution(n, str));
    }

}
