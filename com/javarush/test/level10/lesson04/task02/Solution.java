package com.javarush.test.level10.lesson04.task02;

/**
 * JavaRush.ru
 * Level 10, Lesson 04, Task 02
 * <p/>
 * Расставь где нужно оператор приведения типа:<br />
 * int a = 15;<br />
 * int b = 4;<br />
 * float c1 = a / b;<br />
 * float c2 = (float) a / b;<br />
 * float c3 = (float) (a / b);<br />
 * <p/>
 * Date: 09.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        int a = 15;
        int b = 4;
        float c1 = ( float ) a / b;
        float c2 = ( float ) a / ( float ) b;
        float c3 = ( float ) ( a / b );

        System.out.println( c1 );
    }
}
