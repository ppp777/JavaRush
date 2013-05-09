package com.javarush.test.level16.lesson07.task04;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 16, Lesson 07, Task 04
 * <p/>
 * Обратный отсчет.
 * 1. Разберись, что делает программа.
 * 2. Реализуй логику метода printCountdown так, чтобы каждые полсекунды выводился объект из переменной list в
 * обратном порядке - от переданного индекса до нуля.
 * Пример: Передан индекс 3:
 * Строка 2
 * Строка 1
 * Строка 0
 * <p/>
 * Date: 09.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static List<String> list = new ArrayList<String>( 5 );

    static
    {
        for ( int i = 0; i < 5; i++ )
        {
            list.add( "Строка " + i );
        }
    }

    public static void main( String[] args ) throws InterruptedException
    {
        Thread t = new Thread( new Countdown( 3 ) );
        t.start();
    }

    public static class Countdown implements Runnable
    {
        private int countFrom;

        public Countdown( int countFrom )
        {
            this.countFrom = countFrom;
        }

        public void run()
        {
            try
            {
                while ( countFrom > 0 )
                {
                    printCountdown();
                }
            }
            catch ( InterruptedException e )
            {
            }
        }

        public void printCountdown() throws InterruptedException
        {
            System.out.println( list.get( --countFrom ) );
            Thread.sleep( 500 );
        }
    }
}
