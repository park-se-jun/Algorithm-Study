package chap01;

public class Chap01_01 {
    public static int solution(String s, char c){
        int answer = 0;
        for(char x : s.toCharArray()){
            if(Character.toLowerCase(x) == Character.toLowerCase(c)){
                answer++;
            }
        }
        return answer;
    }
}
