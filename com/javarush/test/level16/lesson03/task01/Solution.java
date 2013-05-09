package com.javarush.test.level16.lesson03.task01;

/**
 * JavaRush.ru
 * Level 16, Lesson 03, Task 01
 * <p/>
 * Создать public static class TestThread - нить с помощью интерфейса Runnable. TestThread должен выводить в консоль
 * "My first thread".
 * <p/>
 * Date: 04.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        TestThread thread = new TestThread();
        thread.run();
    }

    public static class TestThread implements Runnable
    {
        @Override
        public void run()
        {
            System.out.println( "My first thread" );
        }
    }
}
