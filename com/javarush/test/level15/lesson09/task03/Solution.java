package com.javarush.test.level15.lesson09.task03;

/**
 * JavaRush.ru
 * Level 15, Lesson 09, Task 03
 * <p/>
 * 1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями. <b/>
 * intVar с типом int <b/>
 * doubleVar с типом double <b/>
 * DoubleVar с типом Double <b/>
 * booleanVar с типом boolean <b/>
 * ObjectVar с типом Object <b/>
 * ExceptionVar с типом Exception <b/>
 * StringVar с типом String <b/>
 * 2. В методе main вывести их значения в заданном порядке
 * <p/>
 * Date: 07.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    static public int intVar;
    static public double doubleVar;
    static public Double DoubleVar;
    static public boolean booleanVar;
    static public Object ObjectVar;
    static public Exception ExceptionVar;
    static public String StringVar;

    public static void main( String[] args )
    {
        System.out.println( intVar );
        System.out.println( doubleVar );
        System.out.println( DoubleVar );
        System.out.println( booleanVar );
        System.out.println( ObjectVar );
        System.out.println( ExceptionVar );
        System.out.println( StringVar );
    }
}
