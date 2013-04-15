package com.javarush.test.level09.lesson11.home04;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main( String[] args )
    {
        char[] symbol = "Я не хочу изучать Java, я хочу большую зарплату".toCharArray();

        for ( int i = 0; i < 40; i++ )
        {
            System.out.println( String.copyValueOf( symbol, i, symbol.length - i) );
        }
    }
}
// Другой вариант:
//
//public class Solution
//{
//    public static void main( String[] args )
//    {
//        String s = "Я не хочу изучать Java, я хочу большую зарплату";
//
//        for ( int i = 0; i < 40; i++ )
//        {
//            System.out.println( s.substring( i ) );
//        }
//
//    }
//}
