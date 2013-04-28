package com.javarush.test.level13.lesson02.task02;

/**
 * JavaRush.ru
 * Level 13, Lesson 02, Task 02
 * <p/>
 * Добавьте к классу Beer интерфейс Drink и реализуйте все нереализованные методы
 * <p/>
 * Date: 28.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        Drink beer = new Beer();
        System.out.println( beer.toString() );
    }

    public interface Drink
    {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink
    {
        public boolean isAlcoholic()
        {
            return true;
        }

        @Override
        public String toString()
        {
            if ( isAlcoholic() )
            {
                return "Напиток алкогольный";
            }
            else
            {
                return "Напиток безалкогольный";
            }
        }
    }
}
