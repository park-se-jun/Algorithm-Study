package Chapter05;

import java.util.Scanner;
import java.util.Stack;

public class Exam_05_05 {
    public static int solution(String str){
        int answer = 0;
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            // 레이저의 괄호이든, 막대기의 끝을 나타내는 괄호이든 상관없이 Push.
            if(str.charAt(i) == '(') st.push('(');
            else {
                // 레이저의 괄호이든, 막대기의 끝을 나태는 괄호이든 상관없이 Pop.
                st.pop();

                if(str.charAt(i - 1) == '(') answer += st.size();
                else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution(str));
    }
}
