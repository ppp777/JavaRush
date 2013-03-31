/**
 *
 *JavaRush.ru
 *Level 07, Lesson 12, home 01
 *
 * Ввести с клавиатуры 10 чисел и вывести их в обратном порядке
 *
 * Date: 31.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution
{
    public static final int N = 10;

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[N];

        for (int i = 0; i < numbers.length; i++ )
        {
            numbers[i] = Integer.parseInt( reader.readLine() );
        }

        for (int i = numbers.length - 1; i >= 0; i--)
        {
            System.out.println(numbers[i]);
        }
    }
}
