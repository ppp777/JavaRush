package com.javarush.test.level12.lesson02.task01;

/**
 * JavaRush.ru
 * Level 12, Lesson 02, Task 01
 * <p/>
 * Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала: Я не корова, Я – кит.
 * <p/>
 * Date: 21.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Cow cow = new Whale();

        System.out.println( cow.getName() );
    }

    public static class Cow
    {
        public String getName()
        {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow
    {
        @Override
        public String getName()
        {
            return "Я не корова, Я – кит.";
        }
    }
}

