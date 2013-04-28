package com.javarush.test.level13.lesson02.task03;

/**
 * JavaRush.ru
 * Level 13, Lesson 02, Task 02
 * <p/>
 * Реализуйте интерфейс Drink в классах Beer и Cola
 * <p/>
 * Date: 28.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        print( new Beer() );
        print( new Cola() );
    }

    private static void print( Drink drink )
    {
        System.out.println( drink.getClass().getSimpleName() );
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
    }

    public static class Cola implements Drink
    {
        public boolean isAlcoholic()
        {
            return false;
        }
    }
}
