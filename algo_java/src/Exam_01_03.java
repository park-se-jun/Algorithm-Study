import java.util.Scanner;
/*
    https://cote.inflearn.com/contest/10/problem/01-03
 */
public class Exam_01_03 {
    public static String solution_1(String str){
        String answer = "";
        int min = Integer.MIN_VALUE;
        /*
            공백으로 String을 분할하고 분할된 문자열들의 길이를 비교한다.
         */
        String[] split_str = str.split(" ");

        for(String s : split_str){
            int len = s.length();
            if(min < len){
                min = len;
                answer = s;
            }
        }

        return answer;
    }

    public static String solution_2(String str){
        String answer = "";
        int min = Integer.MIN_VALUE, pos;
        /*
            공백을 찾아서 pos에 Index를 저장.
         */
        while((pos = str.indexOf(' ')) != -1){
            // 첫 번째 문자부터 공백까지 String을 분해함.
            String temp = str.substring(0, pos);
            int len = temp.length();

            // >= 를 사용할 경우, 나중에 같은 길이의 문자열이 발견되면 갱신된다.
            if(len > min){
                min = len;
                answer = temp;
            }

            // 공백부터 시작했으므로 한 칸 떨어진 위치부터 Null까지 문자열을 잘라냄.
            str = str.substring(pos + 1);
        }

        // 마지막 단어가 최장길이인 경우에 대한 처리.
        if(str.length() > min)
            answer = str;

        return answer;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(solution_1(str));
        System.out.println(solution_2(str));
    }
}
