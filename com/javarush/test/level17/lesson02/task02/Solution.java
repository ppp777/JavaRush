package com.javarush.test.level17.lesson02.task02;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 17, Lesson 02, Task 02
 * <p/>
 * Вместе быстрее? Ща проверим :)<br/>
 * 1. Разберись, что и как работает<br/>
 * 2. Создай public static нить SortThread, которая в методе run отсортирует статический массив testArray используя
 * метод sort
 * <p/>
 * Date: 10.08.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static int countThreads = 10;
    public static int[] testArray = new int[1000];

    static
    {
        for ( int i = 0; i < Solution.testArray.length; i++ )
        {
            testArray[i] = i;
        }
    }

    public static void main( String[] args ) throws InterruptedException
    {
        initThreads();
    }

    public static void initThreads() throws InterruptedException
    {
        List<Thread> threads = new ArrayList<Thread>( countThreads );
        for ( int i = 0; i < countThreads; i++ )
        {
            threads.add( new SortThread() );
        }
        for ( Thread thread : threads )
        {
            thread.start();
        }
        for ( Thread thread : threads )
        {
            thread.join();
        }
    }

    public static void sort( int[] array )
    {
        for ( int i = 0; i < array.length - 1; i++ )
        {
            for ( int j = i + 1; j < array.length; j++ )
            {
                if ( array[i] < array[j] )
                {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }

    public static class SortThread extends Thread
    {
        @Override
        public void run()
        {
            sort( testArray );
        }
    }
}
