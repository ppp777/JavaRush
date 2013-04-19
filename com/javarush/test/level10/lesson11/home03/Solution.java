package com.javarush.test.level10.lesson11.home03;

/**
 * JavaRush.ru
 * Level 10, Lesson 11, Home 03
 * <p/>
 * Добавить одну операцию по преобразованию типа, чтобы получался ответ: d = 1.0
 * <p/>
 * Date: 19.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / e;

        System.out.println( d );
    }
}
