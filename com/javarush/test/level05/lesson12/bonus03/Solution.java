package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 05, Lesson 12, bonus 03
 * <p/>
 * Задача: Написать программу, которая вводит 10 чисел с клавиатуры и выводит максимальное из них на экран
 * <p/>
 * Date: 25.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static final int NUMBERS_QTY = 10;   //Кол-во вводимых чисел.

    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int maximum = Integer.parseInt( reader.readLine() );

        for ( int i = 1; i < NUMBERS_QTY; i++ )
        {
            int nextNumber = Integer.parseInt( reader.readLine() );
            if ( nextNumber > maximum )
            {
                maximum = nextNumber;
            }
        }

        System.out.println( maximum );
    }
}

