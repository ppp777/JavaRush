package com.javarush.test.level04.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 04, Lesson 06, Task 02
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        int fourthNumber = Integer.parseInt( reader.readLine() );

        System.out.println( max( max( firstNumber, secondNumber ),
                                 max( thirdNumber, fourthNumber ) ) );
    }

    public static int max( int a, int b )
    {
        return a > b ? a : b;
    }
}
