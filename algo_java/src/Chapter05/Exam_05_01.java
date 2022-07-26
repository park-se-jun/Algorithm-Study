package Chapter05;

import java.util.Scanner;
import java.util.Stack;

public class Exam_05_01 {
    public static String solution(String str){
        String answer = "YES";
        Stack<Character> st = new Stack<>();

        for(char c : str.toCharArray()){
            // 여는 괄호를 만나면 Push
            if(c == '(') st.push(c);

            // 닫는 괄호를 만나면
            else{
                /*
                    닫는 괄호에 맞는 여는 괄호가 스택의 최상단에
                    없으면 "NO"를 반환.
                 */
                if(st.isEmpty()) return "NO";
                st.pop();
            }
        }
        /*
            순차 탐색을 끝내고도 스택에 괄호가 남아있으면 여는 괄호가
            남아있는 것이므로 "NO"를 반환함.
        */
        if(!st.isEmpty()) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution(str));
    }
}
