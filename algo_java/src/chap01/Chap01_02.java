package chap01;

public class Chap01_02 {
    public static String solution(String s){
        StringBuilder answer = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                answer.append(Character.toUpperCase(c));
            }

            else{
                answer.append(Character.toLowerCase(c));
            }
        }

        return answer.toString();
    }
}
