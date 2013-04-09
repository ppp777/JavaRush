package com.javarush.test.level10.lesson04.task01;

/**
 * JavaRush.ru
 * Level 10, Lesson 04, Task 01
 * <p/>
 * Расставь где нужно оператор приведения типа:<br />
 * byte a = 1234;<br />
 * int b = a;<br />
 * byte c = a * a;<br />
 * int d = a / c;<br />
 * <p/>
 * Date: 09.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        byte a = ( byte ) 1234;
        int b = a;
        byte c = ( byte ) ( a * a );
        int d = a / c;
    }
}
