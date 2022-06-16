package Chapter04;

import java.util.HashMap;
import java.util.Scanner;

public class Exam_04_01 {
    public static char solution(int n, String s){
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
            // getOrDefault : 해당 키 값이 없다면 default 값을 넣어줌.
            map.put(c, map.getOrDefault(c, 0) + 1);

        for(char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next();
        System.out.print(solution(n, str));
    }
}
