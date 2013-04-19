package com.javarush.test.level10.lesson11.home02;

/**
 * JavaRush.ru
 * Level 10, Lesson 11, Home 02
 * <p/>
 * Добавить одну операцию по преобразованию типа, чтобы получался ответ: d = 5.5
 * <p/>
 * Date: 19.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / ( double ) e;

        System.out.println( d );
    }
}

//Исходный вариант:
//public class Solution
//{
//    public static void main( String[] args )
//    {
//        int a = 5;
//        int b = 4;
//        int c = 3;
//        int e = 2;
//        double d = a + b / c / e;
//        System.out.println( d );
//    }
//}