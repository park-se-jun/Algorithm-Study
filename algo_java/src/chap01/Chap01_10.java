package chap01;
public class Chap01_10 {
    public static int[] solution(String s, char t){
        int[] answer = new int[s.length()];

        int p = 1000;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t){
                p = 0;
                answer[i] = p;
            }
            else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == t) p = 0;
            else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }
}
