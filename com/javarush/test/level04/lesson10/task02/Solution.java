package com.javarush.test.level04.lesson10.task02;

/**
 * JavaRush.ru
 * Level 04, Lesson 10, Task 02
 * br>
 * Вывести на экран числа от 10 до 1
 * <br>
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        int i = 10;

        while ( i >= 1 )
        {
            System.out.println( i-- );
        }
    }
}
