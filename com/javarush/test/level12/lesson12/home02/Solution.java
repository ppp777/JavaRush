package com.javarush.test.level12.lesson12.home02;

/**
 * JavaRush.ru
 * Level 12, Lesson 12, Home 02
 * <p/>
 * Переопредели метод setName в классе Cat так, чтобы программа выдавала на экран надпись "Я - кот".
 * <p/>
 * Date: 27.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Pet pet = new Cat();
        pet.setName( "Я - пушистик" );

        System.out.println( pet.getName() );
    }

    public static class Pet
    {
        protected String name;

        public Pet()
        {
        }

        public final String getName()
        {
            return name;
        }

        public void setName( String name )
        {
            this.name = name;
        }

    }

    public static class Cat extends Pet
    {
        @Override
        public void setName( String name )
        {
            this.name = "Я – кот";
        }
    }
}
