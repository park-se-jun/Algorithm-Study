package Chapter05;

import java.util.Scanner;
import java.util.Stack;

public class Exam_05_04 {
    public static int solution(String str){
        int answer = 0;
        Stack<Integer> st = new Stack();

        for(char c : str.toCharArray()){
            // 아스키 코드 값만큼 빼서 정수형으로 넣어줌
            if(Character.isDigit(c)) st.push(c - 48);
            else{
                // 우측 피연산자가 스택의 가장 위에 있으므로, 우측 피연산자를 먼저 빼줌.
                int rt = st.pop();
                int lt = st.pop();

                switch (c){
                    case '+' :
                        st.push(lt + rt);
                        break;

                    case '-' :
                        st.push(lt - rt);
                        break;

                    case '*' :
                        st.push(lt * rt);
                        break;

                    case '/' :
                        st.push(lt / rt);
                        break;

                    default :
                }
            }
        }

        // 연산의 결과는 스택의 최하단에 있음.
        answer = st.get(0);

        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution(str));
    }
}
