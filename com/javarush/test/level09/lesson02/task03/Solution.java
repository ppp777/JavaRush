package com.javarush.test.level09.lesson02.task03;

/**
 * JavaRush.ru
 * Level 09, Lesson 02, Task 03
 * <p/>
 * Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого <b/>
 * вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
 * <p/>
 * Date: 08.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        method1();
    }

    public static int method1()
    {
        method2();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element[2].getLineNumber();
    }

    public static int method2()
    {
        method3();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element[2].getLineNumber();
    }

    public static int method3()
    {
        method4();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element[2].getLineNumber();
    }

    public static int method4()
    {
        method5();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element[2].getLineNumber();
    }

    public static int method5()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element[2].getLineNumber();
    }
}
