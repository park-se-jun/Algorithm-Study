package Chapter05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam_05_07 {
    public static String solution(String target, String src){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        // 필수로 이수해야하는 과목을 큐에 넣어줌.
        for(char c : target.toCharArray()) queue.offer(c);

        // 수강하려는 과목 중에 필수 이수 과목이 있으면 큐에서 빼줌.
        for(char x : src.toCharArray()){
            if(queue.contains(x)){
                // 필수 이수 과목인데 큐의 가장 앞이 아니라면
                if(x != queue.poll()) return "NO";
            }
        }

        // 수강하려는 과목 중에 필수 이수 과목이 없다면
        if(!queue.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String target = input.nextLine();
        String src = input.nextLine();
        System.out.println(solution(target, src));
    }
}
