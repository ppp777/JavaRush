package com.javarush.test.level08.lesson11.home07;

/**
 * JavaRush.ru
 * Level 08, Lesson 11, Home 07
 * <p/>
 * Переставь один модификатор static так, чтобы пример скомпилировался.
 * <p/>
 * Date: 08.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static int A = 5;
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main( String[] args )
    {
    }

    public int getValue()
    {
        return D;
    }

    public int getValue2()
    {
        return C;
    }
}


//Исходный текст программы:
//public class Solution
//{
//    public int A = 5;
//    public static int B = 2;
//
//    public int C = A * B;
//    public static int D = B * A;
//
//    public static void main( String[] args )
//    {
//    }
//
//    public static int getValue()
//    {
//        return D;
//    }
//
//    public int getValue2()
//    {
//        return C;
//    }
//}