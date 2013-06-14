package com.javarush.test.level13.lesson11.home07;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Home 07
 * <p/>
 * 1. Создайте класс StringObject.<b/>
 * 2. В классе StringObject реализуйте интерфейс SimpleObject с параметром типа String.<b/>
 * 3. Программа должна компилироваться.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        SimpleObject<String> stringObject = new StringObject<String>();
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    public static class StringObject<T> implements SimpleObject<String>
    {
        public StringObject<T> getInstance()
        {
            return this;
        }
    }
}
