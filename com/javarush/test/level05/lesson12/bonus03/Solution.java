/**
 *
 *JavaRush.ru
 *Level 05, Lesson 12, bonus 03
 *
 * Задача: Написать программу, которая вводит 10 чисел с клавиатуры и выводит максимальное из них на экран
 *
 * Date: 25.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nextNumber, maximum;

        nextNumber = Integer.parseInt(reader.readLine());
        maximum = nextNumber;

        for (int i = 0; i < 9; i++) {
            if (nextNumber > maximum) {
                maximum = nextNumber;
            }
            nextNumber = Integer.parseInt(reader.readLine());
        }

        System.out.println(maximum);
    }
}

