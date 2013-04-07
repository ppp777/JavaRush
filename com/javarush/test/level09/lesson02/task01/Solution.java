package com.javarush.test.level09.lesson02.task01;

/**
 * JavaRush.ru
 * Level 09, Lesson 09, Task 01
 * <p/>
 * Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
 * <p/>
 * Date: 07.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        method2();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2()
    {
        method3();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3()
    {
        method4();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4()
    {
        method5();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5()
    {
        return Thread.currentThread().getStackTrace();
    }
}


