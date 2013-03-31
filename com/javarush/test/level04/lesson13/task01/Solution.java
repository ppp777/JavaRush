package com.javarush.test.level04.lesson13.task01;

/**
 *JavaRush.ru
 *Level 04, Lesson 13, Task 01
 *
 * Вывести на экран чётные числа от 1 до 100
 *
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2)
            System.out.println(i);
    }
}
