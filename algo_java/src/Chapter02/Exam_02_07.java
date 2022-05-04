package Chapter02;

import java.util.Scanner;

public class Exam_02_07 {
    public static int solution(int [] arr){
        //cnt 값으로만 점수를 누적하도록 한다.
        int answer = 0, cnt = 1;
        /*
            배열을 처음부터 끝까지 돌면서 정답이면 cnt 값을 누적한다.
         */
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0) {
                answer += cnt++;
            }
            /*
                정답이 아니면 cnt를 1로 바꾼다.
             */
            else{
                cnt = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        System.out.println(solution(arr));
    }
}
