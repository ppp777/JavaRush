package com.javarush.test.level10.lesson11.home01;

/**
 * JavaRush.ru
 * Level 10, Lesson 11, Home 01
 * <p/>
 * Добавить одну операцию по преобразованию типа, чтобы получался ответ: d = 2.941
 * <p/>
 * Date: 19.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        int a = 50;
        int b = 17;
        double d = ( double ) a / b;

        System.out.println( d );
    }
}


//Исходный вариант:
//public class Solution
//{
//    public static void main(String[] args)
//    {
//        int a = 50;
//        int b = 17;
//        double d = a / b;
//        System.out.println(d);
//    }
//}