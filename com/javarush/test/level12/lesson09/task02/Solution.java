package com.javarush.test.level12.lesson09.task02;

/**
 * JavaRush.ru
 * Level 12, Lesson 09, Task 02
 * <p/>
 * Напиши интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать). Добавить в каждый интерфейс по одному методу.
 * <p/>
 * Date: 27.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
    }

    public interface Fly
    {
        void fly( String newAddress );
    }

    public interface Run
    {
        void setSpeed ( int speed);
    }

    public interface Swim
    {
        void setDistance ( int distance );
    }
}
