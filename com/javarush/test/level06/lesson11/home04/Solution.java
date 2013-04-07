package com.javarush.test.level06.lesson11.home04;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * JavaRush.ru
 * Level 06, Lesson 11, Home 04
 * <p/>
 * Если сегодня четное число, то вывести на экран текст "Мама мыла раму". Если сегодня нечетное число, то вывести на
 * экран текст "Рама мыла маму".
 * <p/>
 * Date: 07.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        GregorianCalendar date = new GregorianCalendar();

        if ( date.get( Calendar.DAY_OF_MONTH ) % 2 == 0 )
        {
            System.out.println( "Мама мыла раму" );
        }
        else
        {
            System.out.println( "Рама мыла маму" );
        }
    }
}
