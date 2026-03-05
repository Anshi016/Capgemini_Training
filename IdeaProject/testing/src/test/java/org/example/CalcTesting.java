package org.example;

import static  org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcTesting {

   /*
    @Test
    void addTest() {
        Calc calc = new Calc();
        int result = calc.add(10 , 20);
        assertEquals(30 , result);
    }
    */



    @ParameterizedTest
    @CsvSource(
            {
                    "10 , 20 , 30 , 'SUCCESS' " ,
                    "5 , 7, 22 , 'ERROR' ",
                    "-10.5 , 10.5 , 0 , 'SUCCESS' ",
                    " 'abc' , 7 ,10 , 'ERROR'"
            }
    )

    void addTest(double a , double b , double expected) {
        Calc calc = new Calc();
        double result = calc.add(a , b);
        assertEquals(expected , result);
    }

     /*
    @Test
    void addInvalidStringTest() {
        Calc calc = new Calc();
        assertThrows(IllegalAccessException.class , () -> calc.add("11" , "25"));
    }

    */

}
