import java.util.Scanner;

public class Exam_01_05 {
    public static String solution(String str){
        String answer = "";
        int lt = 0, rt = str.length() - 1;
        char[] temp_arr = str.toCharArray();

        while(lt < rt){
            if(!Character.isAlphabetic(temp_arr[lt])) lt++;

            else if(!Character.isAlphabetic(temp_arr[rt])) rt++;

            else {
                char temp = temp_arr[lt];
                temp_arr[lt] = temp_arr[rt];
                temp_arr[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(temp_arr);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(solution(str));
    }
}
