/**
 *
 *JavaRush.ru
 *Level 07, Lesson 04, task 04
 *
 * Создать массив на 10 чисел. Ввести с клавиатуры 10 чисел и записать их в массив. Расположить элементы массива в
 * обратном порядке. Вывести результат на экран.
 *
 * Date: 28.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    final static int ARRAY_SIZE = 10; // Размер массива

    public static void main(String[] args) throws Exception
    {
        int[] numbers = new int[ARRAY_SIZE];
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        for (int i = numbers.length - 1; i >= 0; i--)
        {
            numbers[i] = Integer.parseInt( br.readLine() );
        }

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}

