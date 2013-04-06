package com.javarush.test.level08.lesson06.task03;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 08, Lesson 06, Task 03
 * <p/>
 * Измерить сколько времени занимает 10 тысяч вставок для каждого массива. Функция getTimeMsOfInsert должна
 * вернуть время ее исполнения в миллисекундах.
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

        System.out.println( getTimeMsOfInsert( arrayList ) );

        // LinkedList
        LinkedList<Object> linkedList = new LinkedList<Object>();
        System.out.println( getTimeMsOfInsert( linkedList ) );

    }

    public static long getTimeMsOfInsert( List list )
    {
        long currentTime = new Date().getTime();

        insert10000( list );
        return new Date().getTime() - currentTime;
    }

    public static void insert10000( List list )
    {
        for ( int i = 0; i < 10000; i++ )
        {
            list.add( 0, new Object() );
        }
    }
}

