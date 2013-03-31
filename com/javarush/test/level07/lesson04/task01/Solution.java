/**
 *
 *JavaRush.ru
 *Level 07, Lesson 04, task 01
 *
 * Создать массив на 20 чисел.
 *  Ввести с клавиатуры 20 чисел.
 *  Найти среди них максимальное, и вывести его на экран.
 *
 * Date: 28.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = new int[20];
        int maxNumber;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        numbers[0] = Integer.parseInt( br.readLine() );
        maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++ )
        {
            numbers[i] = Integer.parseInt( br.readLine() );
            if (numbers[i] > maxNumber)
            {
                maxNumber = numbers[i];
            }
        }

        System.out.println(maxNumber);
    }
}
