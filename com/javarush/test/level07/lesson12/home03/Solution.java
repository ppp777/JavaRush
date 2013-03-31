/**
 *
 *JavaRush.ru
 *Level 07, Lesson 12, home03
 *
 * Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
 *
 * Date: 01.02.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static final int N = 20;

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
        int[] numbers = new int[N];
        int  maximum = 0;
        int  minimum = 0;

        numbers[0] = Integer.parseInt( reader.readLine() );
        maximum = numbers[0];
        minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            numbers[i] = Integer.parseInt( reader.readLine() );
            if (numbers[i] > maximum)
            {
                maximum = numbers[i];
            }
            if (numbers[i] < minimum)
            {
                minimum = numbers[i];
            }
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
