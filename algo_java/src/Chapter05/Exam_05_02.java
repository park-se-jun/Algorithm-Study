package Chapter05;

import java.util.Scanner;
import java.util.Stack;

public class Exam_05_02 {
    public static String solution(String str){
        String answer = "";
        Stack<Character> st = new Stack<>();

        for(char c : str.toCharArray()){
            // 닫는 괄호가 오면 가장 가까운 여는 괄호까지 Pop
            if(c == ')'){
                while(st.pop() != '(');
            }
            else st.push(c);
        }

        for(int i = 0; i < st.size(); i++)
            answer += st.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution(str));
    }
}
