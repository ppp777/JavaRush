package com.javarush.test.level09.lesson08.task02;

/**
 * JavaRush.ru
 * Level 09, Lesson 08, Task 02
 * <p/>
 * Есть три исключения, последовательно унаследованные от Exception: <br />
 * class Exception1 extends Exception <br />
 * class Exception2 extends Exception1 <br />
 * Exception3 extends Exception2 <br />
 * Есть метод, который описан так: <br />
 * public static void method1() throws Exception1, Exception2, Exception3 <br />
 * Напишите catch, который перехватит все три Exception1, Exception2, Exception3.
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
            method1();
        }
        catch ( Exception1 e )
        {
            System.out.println( e );
        }
    }

    public static void method1() throws Exception1, Exception2, Exception3
    {
        int i = ( int ) ( Math.random() * 3 );
        if ( i == 0 )
        {
            throw new Exception1();
        }
        if ( i == 1 )
        {
            throw new Exception2();
        }
        if ( i == 2 )
        {
            throw new Exception3();
        }
    }
}

class Exception1 extends Exception
{
}

class Exception2 extends Exception1
{
}

class Exception3 extends Exception2
{
}
