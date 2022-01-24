import java.util.Scanner;
/*
    https://cote.inflearn.com/contest/10/problem/01-06
 */
public class Exam_01_06 {
    public static String solution_1(String str){
        String answer = "";
        /*
            String의 각 문자가 처음 등장하는 위치(indexOf)와 인덱스 번호가 일치하면
            최초로 등장하는 문자이므로, 해당 문자만 answer에 저장함.
        */
        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static String solution_2(String str){
        String answer = "";
        /*
            최초의 공백상태인 answer에 문자를 더해나간다. 이 때, indexOf를 사용하여
            answer에 없는 문자들만 추가해나간다.
         */
        for(char c : str.toCharArray()){
            if(answer.indexOf(c) == -1){
                answer += c;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution_1(str));
        System.out.println(solution_2(str));
    }
}
