package com.javarush.test.level16.lesson10.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * JavaRush.ru
 * Level 16, Lesson 10, Task 01
 * <p/>
 * 1. Напишите реализацию метода run в нити Stopwatch (секундомер).
 * 2. Stopwatch должеен посчитать количество секунд, которое прошло от создания нити до ввода строки.
 * 3. Выведите количество секунд в консоль.
 * <p/>
 * Date: 10.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws IOException
    {
        InputStreamReader in = new InputStreamReader( System.in );
        BufferedReader reader = new BufferedReader( in );
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread
    {
        private int seconds;

        public void run()
        {
            Date begin = new Date();
            try
            {
                while ( !this.isInterrupted() )
                {
                    sleep( 1000 );
                }
            }
            catch ( InterruptedException e )
            {
                Date end = new Date();

                seconds = ( int ) ( end.getTime() - begin.getTime() ) / 1000;
                System.out.println( seconds );
            }
        }
    }
}
