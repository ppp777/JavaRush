package com.javarush.test.level09.lesson06.task01;

/**
 * JavaRush.ru
 * Level 09, Lesson 06, Task 01
 * <p/>
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода: <br />
 * int a = 42 / 0; <br />
 * <p/>
 * Date: 09.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        try
        {
            int a = 42 / 0;
        } catch ( ArithmeticException e )
        {
            System.out.println( e );
        }
    }
}
