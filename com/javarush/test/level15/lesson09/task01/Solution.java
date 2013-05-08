package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/**
 * JavaRush.ru
 * Level 15, Lesson 09, Task 01
 * <p/>
 * В статическом блоке инициализировать labels 5 различными парами.
 * <p/>
 * Date: 07.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put( 1.0, "11" );
        labels.put( 2.0, "22" );
        labels.put( 3.0, "33" );
        labels.put( 4.0, "44" );
        labels.put( 5.0, "55" );
    }

    public static void main( String[] args )
    {
        System.out.println( labels );
    }
}
