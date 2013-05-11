package com.javarush.test.level16.lesson13.home06;

/**
 * JavaRush.ru
 * Level 16, Lesson 13, Home 06
 * <p/>
 * Разберись, как работает программа.
 * По образу и подобию CountDownRunnable  создай нить CountUpRunnable, которая выводит значения в нормальном
 * порядке - от 1 до 5
 * <p/>
 * Date: 11.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static int number = 5;

    public static void main( String[] args )
    {
        new CountDownRunnable( "было" );
        new CountUpRunnable( "стало" );
    }

    public static class CountUpRunnable implements Runnable
    {
        private int countIndexUp = 1;
        private Thread t;

        public CountUpRunnable( String name )
        {
            t = new Thread( this, name );
            t.start();
        }

        @Override
        public void run()
        {
            try
            {
                while ( true )
                {
                    System.out.println( toString() );
                    ++countIndexUp;
                    if ( countIndexUp > Solution.number )
                    {
                        return;
                    }
                    Thread.sleep( 500 );
                }
            }
            catch ( InterruptedException e )
            {
            }
        }

        @Override
        public String toString()
        {
            return t.getName() + ": " + countIndexUp;
        }
    }

    public static class CountDownRunnable implements Runnable
    {
        private int countIndexDown = Solution.number;
        private Thread t;

        public CountDownRunnable( String name )
        {
            t = new Thread( this, name );
            t.start();
        }

        @Override
        public void run()
        {
            try
            {
                while ( true )
                {
                    System.out.println( toString() );
                    countIndexDown -= 1;
                    if ( countIndexDown == 0 )
                    {
                        return;
                    }
                    Thread.sleep( 500 );
                }
            }
            catch ( InterruptedException e )
            {
            }
        }

        @Override
        public String toString()
        {
            return t.getName() + ": " + countIndexDown;
        }
    }
}
