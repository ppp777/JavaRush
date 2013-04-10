package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 08, Lesson 11, Home 04
 * <p/>
 * Ввести с клавиатуры пять чисел. Вывести на экран минимальное из них.
 * <p/>
 * Date: 08.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int minNumber = Integer.parseInt( reader.readLine() );

        for ( int i = 0; i < 4; i++ )
        {
            int n = Integer.parseInt( reader.readLine() );

            if ( n < minNumber )
            {
                minNumber = n;
            }
        }

        System.out.println( minNumber );
    }
}
