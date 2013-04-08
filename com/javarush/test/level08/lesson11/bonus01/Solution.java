package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 08, Lesson 11, Bonus 01
 * <p/>
 * Нужно исправить программу, чтобы компилировалась и работала.
 * Задача: Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is 5 month"
 * <p/>
 * Date: 08.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        List<String> months = new ArrayList<String>();
        months.add( "January" );
        months.add( "February" );
        months.add( "March" );
        months.add( "April" );
        months.add( "May" );
        months.add( "June" );
        months.add( "July" );
        months.add( "August" );
        months.add( "September" );
        months.add( "October" );
        months.add( "November" );
        months.add( "December" );

        String month = reader.readLine();

        if ( months.contains( month ) )
        {
            int monthNumber = months.indexOf( month ) + 1;
            System.out.println( month + " is " + monthNumber + " month" );
        }
        else
        {
            System.out.println( month + " is't month" );
        }
    }
}

// Исходный вариант программы:
//public class Solution
//{
//    public static void main( String[] args ) throws IOException
//    {
//        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
//
//        Set<String> months = new HashSet<String>();
//        months.add( "January" );
//        months.add( "February" );
//        months.add( "March" );
//        months.add( "April" );
//        months.add( "May" );
//        months.add( "June" );
//        months.add( "July" );
//        months.add( "August" );
//        months.add( "September" );
//        months.add( "October" );
//        months.add( "November" );
//        months.add( "December" );
//
//        String month = reader.readLine();
//        if ( months.contains( month ) )
//        {
//            int monthNumber = months.indexOf( month ) + 1;
//            System.out.println( month + " is " + monthNumber + " month" );
//        }
//        else
//        {
//            System.out.println( month + " is't month" );
//        }
//    }
//}
