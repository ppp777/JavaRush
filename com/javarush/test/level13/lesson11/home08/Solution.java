package com.javarush.test.level13.lesson11.home08;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Home 08
 * <p/>
 * Реализовать интерфейс Updatable в классе Screen
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
    }

    interface Selectable
    {
        void onSelect();
    }

    interface Updatable extends Selectable
    {
        void refresh();
    }

    class Screen implements Updatable
    {
        public void refresh() {}
        public void onSelect() {}
    }
}
