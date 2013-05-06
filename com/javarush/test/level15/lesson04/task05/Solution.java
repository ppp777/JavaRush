package com.javarush.test.level15.lesson04.task05;

/**
 * JavaRush.ru
 * Level 15, Lesson 04, Task 05
 * <p/>
 * Убрать в методе main лишние строки, для которых метод add нереализован.
 * <p/>
 * Date: 06.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        add( ( short ) 1, 2f );
        add( 1, 2 );
        add( 2d, 2 );
        //add( "1", 2d );
        add( ( byte ) 1, 2d );
    }

    public static void add( int i, int j )
    {
        System.out.println( "Integer addition" );
    }

    public static void add( int i, double j )
    {
        System.out.println( "Integer and double addition" );
    }

    public static void add( double i, double j )
    {
        System.out.println( "Double addition" );
    }
}
