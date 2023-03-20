package chap02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Chap02Test {
    @Test
    void Problem01(){
        int[] numbers = {7, 3, 9, 5, 6, 12};
        int[] answer = Chap02_01.solution(numbers.length, numbers);
        Assertions.assertArrayEquals(new int[]{7, 9, 6, 12}, answer);
    }

    @Test
    void Problem02(){
        int n = 8;
        int[] students1 = {130, 135, 148, 140, 145, 150, 150, 153};
        int[] students2 = {120, 110, 150, 140, 170, 180, 180, 165};

        int answer = Chap02_02.solution(n, students1);
        Assertions.assertEquals(5, answer);

        answer = Chap02_02.solution(n, students2);
        Assertions.assertEquals(4, answer);
    }
}
