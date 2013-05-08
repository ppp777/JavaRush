package com.javarush.test.level15.lesson09.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 15, Lesson 09, Task 02
 * <p/>
 * 1. В статическом блоке считайте две переменные с консоли А и В с типом int. <b/>
 * 2. Не забыть про IOException, который надо обработать в блоке catch. <b/>
 * 3. Закрыть поток ввода методом close()
 * <p/>
 * Date: 07.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static int A;
    public static int B;

    static
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        try
        {
            A = Integer.parseInt( reader.readLine() );
            B = Integer.parseInt( reader.readLine() );
            reader.close();
        }
        catch ( Exception e )
        {
        }
    }

    public static final int MIN = min( A, B );

    public static void main( String[] args )
    {
        System.out.println( MIN );
    }

    public static int min( int a, int b )
    {
        return a < b ? a : b;
    }
}
