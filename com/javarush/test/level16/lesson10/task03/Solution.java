package com.javarush.test.level16.lesson10.task03;

/**
 * JavaRush.ru
 * Level 16, Lesson 10, Task 03
 * <p/>
 * Создай нить TestThread.
 * В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
 * <p/>
 * Date: 10.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws InterruptedException
    {
        TestThread thread = new TestThread();
        thread.start();
        thread.interrupt();
    }

    public static class TestThread extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                while ( !isInterrupted() )
                {
                    sleep( 1000 );
                }
            }
            catch ( InterruptedException e )
            {
            }
        }
    }
}
