package com.javarush.test.level12.lesson02.task05;

/**
 * JavaRush.ru
 * Level 12, Lesson 02, Task 05
 * <p/>
 * Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из:
 * «Корова», «Кит», «Собака», «Неизвестное животное».
 * Date: 26.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        System.out.println( getObjectType( new Cow() ) );
        System.out.println( getObjectType( new Dog() ) );
        System.out.println( getObjectType( new Whale() ) );
        System.out.println( getObjectType( new Pig() ) );
    }

    public static String getObjectType( Object o )
    {
        if ( o instanceof Cow )
        {
            return "Корова";
        }
        if ( o instanceof Whale )
        {
            return "Кит";
        }
        if ( o instanceof Dog )
        {
            return "Собака";
        }

        return "Неизвестное животное";
    }

    public static class Cow
    {
    }

    public static class Dog
    {
    }

    public static class Whale
    {
    }

    public static class Pig
    {
    }
}
