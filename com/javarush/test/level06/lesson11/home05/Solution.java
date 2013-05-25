package com.javarush.test.level06.lesson11.home05;

/**
 * JavaRush.ru
 * Level 06, Lesson 11, home 05
 * <p/>
 * Вывести на экран таблицу умножения 10х10
 * <p/>
 * Date: 27.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        for ( int i = 1; i <= 10; i++ )
        {
            for ( int j = 1; j <= 10; j++ )
            {
                System.out.print( i * j + " " );
            }
            System.out.println();
        }
    }
}
