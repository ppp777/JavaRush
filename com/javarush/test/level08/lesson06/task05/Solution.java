package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 08, Lesson 06, Task 05
 * Написать функцию, которая возвращает список, который лучше всего подходит для выполнения данных операций
 * (быстрее всего справится с большим количеством операций).
 * Date: 06.03.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static List getListForGet()
    {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        LinkedList<Object> linkedList = new LinkedList<Object>();

        insert10000( arrayList );
        insert10000( linkedList );

        long arrayListGetTime = getTimeMsOfGet( arrayList );
        long linkedListGetTime = getTimeMsOfGet( linkedList );

        System.out.println(arrayListGetTime);     /////////////////////////////
        System.out.println(linkedListGetTime);    /////////////////////////////

        return ( arrayListGetTime < linkedListGetTime ) ? arrayList : linkedList;
    }

    public static List getListForSet()
    {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        LinkedList<Object> linkedList = new LinkedList<Object>();

        insert10000( arrayList );
        insert10000( linkedList );

        long arrayListSetTime = getTimeMsOfSet( arrayList );
        long linkedListSetTime = getTimeMsOfSet( linkedList );

        System.out.println(arrayListSetTime);     /////////////////////////////
        System.out.println(linkedListSetTime);    /////////////////////////////

        return ( arrayListSetTime < linkedListSetTime ) ? arrayList : linkedList;
    }

    public static List getListForAddOrInsert()
    {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        LinkedList<Object> linkedList = new LinkedList<Object>();

        long arrayListAddTime = getTimeMsOfInsert( arrayList );
        long linkedListAddTime = getTimeMsOfInsert( linkedList );

        System.out.println(arrayListAddTime);     /////////////////////////////
        System.out.println(linkedListAddTime);    /////////////////////////////
        return ( linkedListAddTime < arrayListAddTime ) ? linkedList : arrayList;

    }

    public static List getListForRemove()
    {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        LinkedList<Object> linkedList = new LinkedList<Object>();

        insert10000( arrayList );
        insert10000( linkedList );

        long arrayListRemoveTime = getTimeMsOfRemove( arrayList );
        long linkedListRemoveTime = getTimeMsOfRemove( linkedList );

        System.out.println(arrayListRemoveTime);     /////////////////////////////
        System.out.println(linkedListRemoveTime);    /////////////////////////////

        return ( arrayListRemoveTime < linkedListRemoveTime ) ? arrayList : linkedList;
    }

    private static long getTimeMsOfGet( List list )
    {
        long currentTime = new Date().getTime();

        get10000( list );
        return new Date().getTime() - currentTime;
    }

    private static long getTimeMsOfSet( List list )
    {
        long currentTime = new Date().getTime();

        set10000( list );
        return new Date().getTime() - currentTime;
    }

    private static long getTimeMsOfRemove( List list )
    {
        long currentTime = new Date().getTime();

        remove10000( list );
        return new Date().getTime() - currentTime;
    }

    private static long getTimeMsOfInsert( List list )
    {
        long currentTime = new Date().getTime();

        insert10000( list );
        return new Date().getTime() - currentTime;
    }

    private static void get10000( List list )
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

    private static void insert10000( List list )
    {
        for ( int i = 0; i < 10000; i++ )
        {
            list.add( 0, new Object() );
        }
    }

    private static void set10000( List list )
    {
        for ( int i = 0; i < 10000; i++ )
        {
            list.set( i, new Object() );
        }
    }

    public static void remove10000( List list )
    {
        for ( int i = 0; i < 10000; i++ )
        {
            list.remove( 0 );
        }
    }

    public static void main( String[] args )
    {
        getListForGet();
        getListForSet();
        getListForAddOrInsert();
        getListForRemove();
    }
}

