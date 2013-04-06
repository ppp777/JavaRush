package com.javarush.test.level08.lesson06.task04;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 08, Lesson 06, Task 04
 * <p/>
 * Измерить сколько времени занимает 10 тысяч вызовов get для каждого массива. Функция getTimeMsOfGet
 * должна вернуть время ее исполнения в миллисекундах.
 * <p/>
 * Date: 12.02.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        // ArrayList
        ArrayList<Object> arrayList = new ArrayList<Object>();

        insert10000( arrayList );
        System.out.println( getTimeMsOfGet( arrayList ) );

        // LinkedList
        LinkedList<Object> linkedList = new LinkedList<Object>();

        insert10000( linkedList );
        System.out.println( getTimeMsOfGet( linkedList ) );
    }

    public static long getTimeMsOfGet( List list )
    {
        long currentTime = new Date().getTime();

        get10000( list );
        return new Date().getTime() - currentTime;
    }

    public static void insert10000( List list )
    {
        for ( int i = 0; i < 10000; i++ )
        {
            list.add( 0, new Object() );
        }
    }

    public static void get10000( List list )
    {
        if ( list.isEmpty() )
        {
            return;
        }
        int x = list.size() / 2;

        for ( int i = 0; i < 10000; i++ )
        {
            list.get( x );
        }
    }
}

