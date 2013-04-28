package com.javarush.test.level13.lesson02.task07;

/**
 * JavaRush.ru
 * Level 13, Lesson 02, Task 07
 * <p/>
 * В классе StringObject реализуйте интерфейс SimpleObject с параметром типа String
 * <p/>
 * Date: 28.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>
    {
        public StringObject getInstance()
        {
            return this;
        }
    }
}
