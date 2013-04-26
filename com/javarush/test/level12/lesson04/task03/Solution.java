package com.javarush.test.level12.lesson04.task03;

/**
 * JavaRush.ru
 * Level 12, Lesson 04, Task 03
 * <p/>
 * Написать пять методов print с разными параметрами.
 * Date: 26.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        print( 5 );
        print( "Su25" );
        print( 'w' );
        print( 5d );
        print( ( byte ) 0x80 );
    }

    public static void print( int n )
    {
        System.out.println( n );
    }

    public static void print( String s )
    {
        System.out.println( s );
    }

    public static void print( char ch )
    {
        System.out.println( ch );
    }

    public static void print( double x )
    {
        System.out.println( x );
    }

    public static void print( byte n )
    {
        System.out.println( n );
    }
}

