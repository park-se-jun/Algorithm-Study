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
        int[] students = {130, 135, 148, 140, 145, 150, 150, 153};
        int answer = Chap02_02.solution(n, students);
        Assertions.assertEquals(5, answer);
    }
}
