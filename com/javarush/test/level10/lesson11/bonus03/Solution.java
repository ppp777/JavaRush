package com.javarush.test.level10.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 10, Lesson 11, Bonus 03
 * <p/>
 * Ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
 * <p/>
 * Date: 22.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[10]);
        System.out.println(array[11]);
    }

    public static void sort(int[] array)
    {
        for ( int i = 0; i < array.length - 1; i++ )
        {
            for ( int j = 0; j < array.length - i - 1; j++ )
            {
                if ( array[j] > array[j + 1] )
                {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
