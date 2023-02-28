package chap01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Chap01Test {
    @Test
    void problem01(){
        int answer = Chap01_01.solution("Computercooler", 'c');
        Assertions.assertEquals(2, answer);
    }

    @Test
    void problem02(){
        String answer = Chap01_02.solution("StuDY");
        Assertions.assertEquals("sTUdy", answer);

        answer = Chap01_02.solution2("StuDY");
        Assertions.assertEquals("sTUdy", answer);
    }

    @Test
    void problem03(){
        String answer = Chap01_03.solution("it is time to study");
        Assertions.assertEquals("study", answer);
    }

    @Test
    void problem04(){

    }

    @Test
    void problem05(){

    }

    @Test
    void problem06(){

    }

    @Test
    void problem07(){

    }

    @Test
    void problem08(){

    }


    @Test
    void problem09(){

    }

    @Test
    void problem10(){

    }

    @Test
    void problem11(){

    }

    @Test
    void problem12(){

    }
}
