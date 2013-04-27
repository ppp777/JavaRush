package com.javarush.test.level12.lesson12.home04;

/**
 * JavaRush.ru
 * Level 12, Lesson 12, Home 04
 * <p/>
 * Напиши метод, который определяет, какой объект передали в него. Программа должна выводить на экран одну из надписей:
 * "Кот", "Тигр", "Лев", "Бык", "хз".
 * <p/>
 * Date: 27.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        System.out.println( getObjectType( new Cat() ) );
        System.out.println( getObjectType( new Tiger() ) );
        System.out.println( getObjectType( new Lion() ) );
        System.out.println( getObjectType( new Bull() ) );
        System.out.println( getObjectType( new Pig() ) );
    }

    public static String getObjectType( Object o )
    {
        if ( o instanceof Cat )
        {
            return "Кот";
        }
        if ( o instanceof Tiger )
        {
            return "Тигр";
        }
        if ( o instanceof Lion )
        {
            return "Лев";
        }
        if ( o instanceof Bull )
        {
            return "Бык";
        }

        return "хз";
    }

    public static class Cat
    {
    }

    public static class Tiger
    {
    }

    public static class Lion
    {
    }

    public static class Bull
    {
    }

    public static class Pig
    {
    }
}
