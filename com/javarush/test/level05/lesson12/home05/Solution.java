package com.javarush.test.level05.lesson12.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 05, Lesson 12, home 05
 * <p/>
 * Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
 * Вывести на экран полученную сумму
 * <p/>
 * Date: 25.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String s;
        int sum = 0;

        while ( !"сумма".equals( s = reader.readLine() ) )
        {
            sum += Integer.parseInt( s );
        }

        System.out.println( sum );
    }
}
