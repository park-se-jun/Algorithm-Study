package Chapter04;

import java.util.HashMap;
import java.util.Scanner;

public class Exam_04_04 {
    public static int solution(String s, String t){
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        int t_length = t.length() - 1;
        int lt = 0;

        for(char x : t.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);
        for(int i = 0; i < t_length; i++) am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0) + 1);

        for(int rt = t_length; rt < s.length(); rt++){
            am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0) + 1);
            if(am.equals(bm)) answer++;

            am.put(s.charAt(lt), am.get(s.charAt(lt)) - 1);
            if(am.get(s.charAt(lt)) == 0) am.remove(s.charAt(lt));
            lt++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();
        System.out.println(solution(s, t));
    }
}
