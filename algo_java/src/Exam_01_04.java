import java.util.ArrayList;
import java.util.Scanner;

public class Exam_01_04 {
    public static ArrayList<String> solution_1(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String s : str){
            String temp = new StringBuilder(s).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }

    public static ArrayList<String> solution_2(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String s : str){
            char[] c = s.toCharArray();
            int lt = 0, rt = s.length() - 1;

            while(lt < rt){
                char temp_char = c[lt];
                c[lt] = c[rt];
                c[rt] = temp_char;
                lt++;
                rt--;
            }
            String temp_str = String.valueOf(c);
            answer.add(temp_str);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String[] str = new String[n];

        for(int i = 0; i < n; i++){
            str[i] = input.next();
        }

        for(String res : solution_1(n, str)){
            System.out.println(res);
        }

        for(String res : solution_2(n, str)){
            System.out.println(res);
        }
    }
}
