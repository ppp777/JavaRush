package com.javarush.test.level12.lesson09.task01;

/**
 * JavaRush.ru
 * Level 12, Lesson 09, Task 01
 * <p/>
 * Напиши свой интерфейс Fly(летать). Добавь в него два метода.
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
        int distance( String destination );
        void fly( String newAddress );
    }
}
