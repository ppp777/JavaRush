package com.javarush.test.level04.lesson13.task03;

/**
 * JavaRush.ru <br/>
 * Level 04, Lesson 13, Task 03
 * <p/>
 * Вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
 * <p/>
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        for ( int i = 10; i > 0; i-- )
        {
            for ( int j = 0; j < i; j++ )
            {
                System.out.print( "8" );
            }
            System.out.println();
        }
    }
}
