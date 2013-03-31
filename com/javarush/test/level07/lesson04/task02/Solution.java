/**
 *
 *JavaRush.ru
 *Level 07, Lesson 04, task 01
 *
 * Создать массив на 10 строчек.
 * Ввести с клавиатуры 8 строчек и сохранить их в массив.
 * Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
 *
 * Date: 28.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] s = new String[10];
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        for (int i = 0; i < 8; i++)
        {
            s[i] = br.readLine();
        }

        for (int i = s.length - 1; i >= 0; i--)
        {
            System.out.println(s[i]);
        }
    }
}

