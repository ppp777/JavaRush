package com.javarush.test.level04.lesson13.task04;

/**
 *JavaRush.ru
 *Level 04, Lesson 13, Task 04
 *
 * Вывести на экран горизонтальную линию из 10 восьмёрок, и вертикальную линию из 10 восьмёрок.
 *
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.print("8");
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.println("8");
    }
}
