package com.javarush.test.level10.lesson04.task03;

/**
 * JavaRush.ru
 * Level 10, Lesson 04, Task 03
 * <p/>
 * Расставь где нужно оператор приведения типа:<br />
 * float f = 333.50;<br />
 * int i = f;<br />
 * byte b = i;<br />
 * <p/>
 * Date: 09.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        float f = ( float ) 333.50;
        int i = ( int ) f;
        byte b = ( byte ) i;
    }
}
