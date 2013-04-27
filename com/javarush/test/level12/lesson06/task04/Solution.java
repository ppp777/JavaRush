package com.javarush.test.level12.lesson06.task04;

/**
 * JavaRush.ru
 * Level 12, Lesson 06, Bonus 04
 * <p/>
 * Унаследуй класс Cow от Animal. Реализуй все недостающие методы в классе Cow.
 * <p/>
 * Date: 27.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
    }

    public static abstract class Animal
    {
        public abstract String getName();
    }

    public static class Cow extends Animal
    {
        String name;

        @Override
        public String getName()
        {
            return name;
        }
    }
}
