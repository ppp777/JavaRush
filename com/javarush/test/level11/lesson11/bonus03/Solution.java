package com.javarush.test.level11.lesson11.bonus03;

/**
 * JavaRush.ru
 * Level 11, Lesson 11, Bonus 03
 * <p/>
 * Задача по алгоритмам. <b/>
 * Написать функцию, которая возвращает минимальное и максимальное числа в массиве.
 * <p/>
 * Date: 25.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        int[] data = new int[]{ 1, 2, 3, 5, -2, -8, 0, 77, 5, 5 };

        Pair<Integer, Integer> result = getMinimumAndMaximum( data );

        System.out.println( "Minimum is " + result.x );
        System.out.println( "Maximum is " + result.y );
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum( int[] array )
    {
        if ( array == null || array.length == 0 )
        {
            return new Pair<Integer, Integer>( null, null );
        }

        int min = array[0];
        int max = array[0];

        for ( int x : array )
        {
            if ( x < min )
            {
                min = x;
            }
            if ( x > max )
            {
                max = x;
            }
        }

        return new Pair<Integer, Integer>( min, max );
    }


    public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair( X x, Y y )
        {
            this.x = x;
            this.y = y;
        }
    }
}
