package com.javarush.test.level10.lesson04.task04;

/**
 * JavaRush.ru
 * Level 10, Lesson 04, Task 04
 * <p/>
 * Расставь где нужно оператор приведения типа:<br />
 * short number = 9; <br />
 * char zero = '0';<br />
 * char nine = zero + number;<br />
 * <p/>
 * Date: 09.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        short number = 9;
        char zero = '0';
        char nine = ( char ) ( zero + number );
    }
}
