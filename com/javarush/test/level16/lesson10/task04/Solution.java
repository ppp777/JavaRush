package com.javarush.test.level16.lesson10.task04;

/**
 * JavaRush.ru
 * Level 16, Lesson 10, Task 04
 * <p/>
 * Разберись, как работает программа.
 * Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
 * Нельзя использовать метод interrupt.
 * <p/>
 * Date: 10.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws InterruptedException
    {
        Thread t = new Thread( new TestThread() );
        t.start();
        Thread.sleep( 3000 );
        ourInterruptMethod();
    }

    public static void ourInterruptMethod()
    {
        TestThread.isCansel = true;
    }

    public static class TestThread implements Runnable
    {
        public static boolean isCansel = false;

        public void run()
        {
            while ( !isCansel )
            {
                try
                {
                    System.out.println( "he-he" );
                    Thread.sleep( 500 );
                }
                catch ( InterruptedException e )
                {
                }
            }
        }
    }
}
