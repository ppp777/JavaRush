package com.javarush.test.level04.lesson13.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *JavaRush.ru
 *Level 04, Lesson 13, Task 05
 *
 * Ввести с клавиатуры имя и 10 раз вывести. *имя* любит меня.
 * Пример текста:
 * Света любит меня.
 *
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        for (int i = 0; i < 10; i++)
            System.out.println(name + " любит меня.");
    }
}
