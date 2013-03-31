package com.javarush.test.level07.lesson12.home07;

/**
*
*JavaRush.ru
*Level 07, Lesson 12, home07
*
*
* Переставь один модификатор static чтобы пример скомпилировался
*
*
* Date: 02.02.13
* @author Sergey Kandalintsev
*
*/

public class Solution
{
    public static int A = 5;
    public static int B = 2;
    public static int C = A*B;

    public static void main(String[] args)
    {
    }

    public int getValue()
    {
        return C;
    }
}

// Исходный текст
//public class Solution
//{
//    public int A = 5;
//    public static int B = 2;
//    public static int C = A*B;
//
//    public static void main(String[] args)
//    {
//    }
//
//    public static int getValue()
//    {
//        return C;
//    }
//
//}