package com.javarush.test.level13.lesson11.home01;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Home 01
 * <p/>
 * Удалите все некорректные строки в интерфейсе Button
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( SimpleObject.NAME );
        System.out.println( Button.NAME );
    }

    interface SimpleObject
    {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject
    {
        final String NAME = "Submit";

        public void onPress();
        //protected void onPress();
        //void onPress();
        //private void onPress();
        //protected String onPress( Object o );
        //String onPress( Object o );
        //private String onPress( Object o );
    }
}
