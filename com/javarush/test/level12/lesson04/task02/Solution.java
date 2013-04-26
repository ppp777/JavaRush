package com.javarush.test.level12.lesson04.task02;

/**
 * JavaRush.ru
 * Level 12, Lesson 04, Task 02
 * <p/>
 * Написать два метода: print(int) и print(Integer). Написать такой код в методе main, чтобы вызвались они оба.
 * Date: 26.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        print( 5 );
        print( new Integer( 25 ) );
    }

    public static void print( int n )
    {
        System.out.println( n );
    }

    public static void print( Integer n )
    {
        System.out.println( n );
    }
}
