package com.javarush.test.level15.lesson02.task01;

/**
 * JavaRush.ru
 * Level 15, Lesson 02, Task 01
 * <p/>
 * 1. Добавить все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes. <b/>
 * 2. Реализовать их методы.
 * <p/>
 * Date: 04.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static interface Movable
    {
        boolean getAllowedAction( String name );
    }

    public static interface Sellable
    {
        Object getAllowedAction( String name );
    }

    public static interface Discountable
    {
        Object getAllowedAction();
    }

    public static class Clothes implements Sellable, Discountable
    {
        @Override
        public Object getAllowedAction()
        {
            return this;
        }

        @Override
        public Object getAllowedAction( String name )
        {
            return this;
        }
    }
}
