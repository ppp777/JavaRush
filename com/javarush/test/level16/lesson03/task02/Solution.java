package com.javarush.test.level16.lesson03.task02;

/**
 * JavaRush.ru
 * Level 16, Lesson 03, Task 02
 * <p/>
 * 1. Создать public static класс TestThread унаследовавшись от класса Thread. <b/>
 * 2. Создать статик блок внутри TestThread, который выводит в консоль "it's static block inside TestThread". <b/>
 * 3. Метод run должен выводить в консоль "it's run method".
 * <p/>
 * Date: 09.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        TestThread thread = new TestThread();
        thread.run();
    }

    public static class TestThread extends Thread
    {
        static
        {
            System.out.println( "it's static block inside TestThread" );
        }

        @Override
        public void run()
        {
            System.out.println( "it's run method" );
        }
    }
}
