package Chapter05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 환자에 대한 정보를 담을 클래스
class Person{
    int id;
    int priority;

    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class Exam_05_08 {
    public static int solution(int n, int m, int[] list){
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();

        //환자 목록에 ID 값을 부여하여 대기 목록에 넣음.
        for(int i = 0; i < n; i++)
            Q.offer(new Person(i, list[i]));

        while(!Q.isEmpty()){
            // 대기 목록의 제일 앞에 있는 환자를 꺼냄.
            Person temp = Q.poll();


            // 제일 앞의 환자와 뒤에 있는 환자들의 우선 순위를 각각 비교함.
            for(Person x : Q){
                // 뒤에 있는 환자의 우선 순위가 높은 경우
                if(x.priority > temp.priority){
                    Q.offer(temp);
                    temp = null;
                    break;
                }
            }
            // 뒤에 있는 환자의 우선 순위가 높은 경우, 환자의 진료 순위를 뒤로 미룸.
            if (temp != null) {
                answer++;
                // 현재 환자의 번호와 찾으려는 환자의 번호가 같으면 프로그램 종료.
                if(temp.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int [] list = new int[n];

        for(int i = 0; i < n; i++)
            list[i] = input.nextInt();

        System.out.println(solution(n, m, list));
    }
}
