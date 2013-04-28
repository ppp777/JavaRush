package com.javarush.test.level13.lesson02.task04;

/**
 * JavaRush.ru
 * Level 13, Lesson 02, Task 04
 * <p/>
 * 1. Создайте класс Screen
 * 2. Реализуйте в нем интерфейсы Selectable с методом onSelect, Updatable с методом refresh
 * <p/>
 * Date: 28.04.13
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

    interface Updatable
    {
        void refresh();
    }

    public class Screen implements Selectable, Updatable
    {
        public void onSelect()
        {
        }

        public void refresh()
        {
        }
    }
}
