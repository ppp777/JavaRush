package com.javarush.test.level12.lesson06.task05;

/**
 * JavaRush.ru
 * Level 12, Lesson 06, Bonus 05
 * <p/>
 * Унаследуй классы Cat и Dog от Pet. Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
 * <p/>
 * Date: 27.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
    }

    public static abstract class Pet
    {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet
    {
        @Override
        public String getName()
        {
            return "Murzik";
        }

        @Override
        public Pet getChild()
        {
            return new Cat();
        }
    }

    public static class Dog extends Pet
    {
        @Override
        public String getName()
        {
            return "Bobik";
        }

        @Override
        public Pet getChild()
        {
            return new Dog();
        }
    }
}
