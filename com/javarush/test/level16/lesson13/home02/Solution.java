package com.javarush.test.level16.lesson13.home02;

/**
 * JavaRush.ru
 * Level 16, Lesson 13, Home 02
 * <p/>
 * 1. В методе run после всех действий поставь задержку в 10 миллисекунд. Выведи "Нить прервана", если нить
 * будет прервана.
 * 2. Сделай так, чтобы все нити выполнялись последовательно: сначала для нити №1 отсчет с COUNT до 1, потом для
 * нити №2 с COUNT до 1 и т.д.
 * Пример:
 * #1: 4
 * #1: 3
 * ...
 * #1: 1
 * #2: 4
 * ...
 * <p/>
 * Date: 10.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static int COUNT = 4;

    public static void main( String[] args ) throws InterruptedException
    {
        for ( int i = 0; i < COUNT; i++ )
        {
            SleepingThread thread = new SleepingThread();
            thread.join();
        }
    }

    public static class SleepingThread extends Thread
    {
        private int countDownIndex = COUNT;
        private static int threadCount = 0;

        public SleepingThread()
        {
            super( String.valueOf( ++threadCount ) );
            start();
        }

        @Override
        public void run()
        {
            while ( true )
            {
                System.out.println( this );
                if ( --countDownIndex == 0 )
                {
                    return;
                }
                try
                {
                    sleep( 10 );
                }
                catch ( InterruptedException e )
                {
                    System.out.println("Нить прервана");
                }
            }
        }

        @Override
        public String toString()
        {
            return "#" + getName() + ": " + countDownIndex;
        }
    }
}
