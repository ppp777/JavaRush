package com.javarush.test.level15.lesson12.home02;

/**
 * JavaRush.ru
 * Level 15, Lesson 12, Home 02
 * <p/>
 * Найти логическую ошибку: метод doAction в реализации интерфейса Movable должен выдавать "moving". <b/>
 * Исправьте ошибку, при необходимости измените (отрефакторите) интерфейс Movable. <b/>
 * Результат вывода в консоль должен быть: <b/>
 * flying <b/>
 * moving
 * <p/>
 * Date: 09.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Duck duck = new Duck();
        Util.fly( duck );
        Util.move( duck );
    }

    public static class Duck implements Flyable, Movable
    {
        @Override
        public void doFly()
        {
            System.out.println( "flying" );
        }
        @Override
        public void doMove()
        {
            System.out.println( "moving" );
        }
    }

    public static class Util
    {
        static void fly( Flyable animal )
        {
            animal.doFly();
        }

        static void move( Movable animal )
        {
            animal.doMove();
        }
    }

    public static interface Flyable
    {
        void doFly();
    }

    public static interface Movable
    {
        void doMove();
    }
}