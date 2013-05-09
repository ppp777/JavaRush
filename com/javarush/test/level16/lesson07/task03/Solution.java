package com.javarush.test.level16.lesson07.task03;

/**
 * JavaRush.ru
 * Level 16, Lesson 07, Task 03
 * <p/>
 * Big Ben clock
 * 1. Разберись, что делает программа.
 * 2. Реализуйте логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в
 * конструкторе.
 * Пример:
 * В г. Лондон сейчас 23:59:58!
 * В г. Лондон сейчас 23:59:59!
 * В г. Лондон сейчас полночь!
 * В г. Лондон сейчас 0:0:1!
 * <p/>
 * Date: 09.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static boolean isStopped = false;

    public static void main( String[] args ) throws InterruptedException
    {
        Clock clock = new Clock( "Лондон", 23, 59, 57 );
        Thread.sleep( 4000 );
        isStopped = true;
        Thread.sleep( 1000 );
    }

    public static class Clock extends Thread
    {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock( String cityName, int hours, int minutes, int seconds )
        {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run()
        {
            try
            {
                while ( !isStopped )
                {
                    printTime();
                }
            }
            catch ( InterruptedException e )
            {
            }
        }

        private void printTime() throws InterruptedException
        {
            if ( ++seconds == 60 )
            {
                seconds = 0;
                if ( ++minutes == 60 )
                {
                    minutes = 0;
                    if ( ++hours == 24 )
                    {
                        hours = 0;
                    }
                }
            }

            if ( hours == 0 && minutes == 0 && seconds == 0 )
            {
                System.out.println( String.format( "В г. %s сейчас полночь!", cityName ) );
            }
            else
            {
                System.out.println( String.format( "В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds ) );
            }

            sleep( 1000 );
        }
    }
}
