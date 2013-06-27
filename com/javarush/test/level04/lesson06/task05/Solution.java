package com.javarush.test.level04.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 04, Lesson 06, Task 05
 * <br>
 * Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти ещё»
 * <br>
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt( sAge );

        if ( nAge < 18 )
        {
            System.out.println( "Подрасти ещё" );
        }
    }
}
