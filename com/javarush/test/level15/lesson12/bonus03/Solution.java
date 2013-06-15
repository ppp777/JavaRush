package com.javarush.test.level15.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * JavaRush.ru
 * Level 15, Lesson 12, Bonus 03
 * <p/>
 * Написать метод, который вичисляет факториал - произведение всех чисел от 1 до введенного числа включая его. <b/>
 * Пример: factorial(4) = 1*2*3*4 = 24 <b/>
 * 1. Ввести с консоли число <=150 <b/>
 * 2. Реализовать фукнцию  factorial <b/>
 * 3. Если введенное число <= 0, то вывести 0
 * <p/>
 * Date: 08.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) )
        {
            int input = Integer.parseInt( reader.readLine() );
            System.out.println( factorial( input ) );
        }
        catch ( NumberFormatException | IOException e )
        {
            e.printStackTrace();
        }
    }

    public static String factorial( int n ) throws IllegalArgumentException
    {
        if ( n > 150 )
        {
            throw new IllegalArgumentException();
        }
        if ( n <= 0 )
        {
            return "0";
        }
        BigInteger result = BigInteger.ONE;

        while ( n > 0 )
        {
            result = result.multiply( BigInteger.valueOf( n-- ) );
        }
        return result.toString();
    }
}
