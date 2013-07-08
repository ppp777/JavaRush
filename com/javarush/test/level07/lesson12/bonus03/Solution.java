package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * JavaRush.ru
 * Level 07, Lesson 12, home02
 * <p/>
 * <p/>
 * Программа вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
 * <p/>
 * <p/>
 * Date: 02.02.13
 * @author Sergey Kandalintsev
 */

public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        Integer[] array = new Integer[20];

        for ( int i = 0; i < 20; i++ )
        {
            array[i] = Integer.parseInt( reader.readLine() );
        }

        sort( array );

        for ( int x : array )
        {
            System.out.println( x );
        }
    }

    public static void sort( Integer... array )
    {
        Arrays.sort( array, Collections.reverseOrder() );
    }
}
