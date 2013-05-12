package com.javarush.test.level04.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 04, Lesson 06, Task 03
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания.
 * <p/>
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int firstNumber = Integer.parseInt( reader.readLine() );
        int secondNumber = Integer.parseInt( reader.readLine() );
        int thirdNumber = Integer.parseInt( reader.readLine() );

        printNumbers( firstNumber, secondNumber, thirdNumber );
    }

    public static void printNumbers( int a, int b, int c )
    {
        int tmp;

        if ( a < b )
        {
            tmp = a;
            a = b;
            b = tmp;
        }

        if ( b < c )
        {
            tmp = b;
            b = c;
            c = tmp;
        }

        if ( a < b )
        {
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println( "" + a + " " + b + " " + c );
    }
}
