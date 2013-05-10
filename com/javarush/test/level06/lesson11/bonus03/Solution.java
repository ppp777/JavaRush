package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * JavaRush.ru
 * Level 06, Lesson 11, bonus 03
 * <p/>
 * Задача: Программа вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
 * <p/>
 * Date: 27.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        final int N = 5;
        int[] numbers = new int[N];
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        for ( int i = 0; i < numbers.length; i++ )
        {
            numbers[i] = Integer.parseInt( reader.readLine() );
        }

        Arrays.sort( numbers );

        for ( int i : numbers )
        {
            System.out.println( i );
        }
    }
}

// Вариант решения с собственной сортировкой "методом пузырька":
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test.Solution
{
    public static void main(String[] args) throws Exception
    {
        final int N = 5;
        int[] numbers = new int[N];
        int tmpNumber;
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++)
        {
            numbers [i] = Integer.parseInt(reader.readLine());
        }

        // Пузырьковая сортировка:
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers.length - 1 - i; j ++)
            {
                if (numbers[j] > numbers[j + 1])
                {
                    tmpNumber = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmpNumber;
                }
            }
        }

        for (int i: numbers)
        {
            System.out.println(i);
        }
    }
}
*/