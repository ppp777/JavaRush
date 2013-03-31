package com.javarush.test.level07.lesson12.home05;

/**
 *
 *JavaRush.ru
 *Level 07, Lesson 12, home05
 *
 * Написать программу, которая ведет обратный отсчет с 30 до 0 и в конце выводит на экран слово "Бум!". Программа
 * должна уменьшать число 10 раз в секунду.
 *
 *
 * Date: 02.02.13
 * @author Sergey Kandalintsev
 *
 */

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i = 30; i >= 0; i--)
        {
            System.out.println(i);
            Thread.sleep(100);
        }

        System.out.println("Бум!");
    }
}
