package com.javarush.test.level04.lesson16.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 04, Lesson 16, Home 03
 * <p/>
 * Вводить с клавиатуры числа и считать их сумму. Вывести на экран полученную сумму. Если пользователь ввел -1,
 * вывести на экран сумму и завершить программу.
 * <p/>
 * Date: 22.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int sum = 0;

        while ( true )
        {
            int nextNumber = Integer.parseInt( reader.readLine() );
            sum += nextNumber;
            if ( nextNumber == -1 )
            {
                break;
            }
        }

        System.out.println( sum );
    }
}

