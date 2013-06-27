package com.javarush.test.level04.lesson10.task01;

/**
 * JavaRush.ru
 * Level 04, Lesson 10, Task 01
 * <br>
 * Вывести на экран числа от 1 до 10
 * <br>
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        int i = 1;
        while ( i <= 10 )
        {
            System.out.println( i++ );
        }
    }
}
