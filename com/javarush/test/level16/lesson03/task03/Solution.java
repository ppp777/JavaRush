package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 16, Lesson 03, Task 03
 * <p/>
 * В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
 * <p/>
 * Date: 09.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static final int THREAD_QTY = 5; // кол-во нитей

    public static List<Thread> list = new ArrayList<Thread>( THREAD_QTY );

    public static void main( String[] args )
    {
        for ( int i = 0; i < THREAD_QTY; i++ )
        {
            list.add( new Thread( new SpecialThread() ) );
        }
    }

    public static class SpecialThread implements Runnable
    {
        public void run()
        {
            System.out.println( "it's run method inside SpecialThread" );
        }
    }
}
