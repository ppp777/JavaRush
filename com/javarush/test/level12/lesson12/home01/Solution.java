package com.javarush.test.level12.lesson12.home01;

/**
 * JavaRush.ru
 * Level 12, Lesson 12, Home 01
 * <p/>
 * Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись "Я - кот".
 * <p/>
 * Date: 27.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Pet pet = new Cat();

        System.out.println( pet.getName() );
    }

    public static class Pet
    {
        public String getName()
        {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet
    {
        @Override
        public String getName()
        {
            return "Я – кот";
        }
    }
}
