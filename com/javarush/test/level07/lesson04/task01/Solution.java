package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 07, Lesson 04, task 01
 * <p/>
 * Создать массив на 20 чисел.
 * Ввести с клавиатуры 20 чисел.
 * Найти среди них максимальное, и вывести его на экран.
 * <p/>
 * Date: 28.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static final int NUMBERS_QTY = 20;   // Кол-во вводимых чмсел

    public static void main( String[] args ) throws Exception
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        int[] numbers = new int[NUMBERS_QTY];

        numbers[0] = Integer.parseInt( br.readLine() );
        int maxNumber = numbers[0];

        for ( int i = 1; i < numbers.length; i++ )
        {
            numbers[i] = Integer.parseInt( br.readLine() );
            if ( numbers[i] > maxNumber )
            {
                maxNumber = numbers[i];
            }
        }

        System.out.println( maxNumber );
    }
}
