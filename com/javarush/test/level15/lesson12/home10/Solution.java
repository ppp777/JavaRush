package com.javarush.test.level15.lesson12.home10;

/**
 * JavaRush.ru
 * Level 15, Lesson 12, Home 10
 * <p/>
 * Исправить класс Hrivna так, чтоб избежать ошибку StackOverflowError, класс Money менять нельзя.
 * <p/>
 * Date: 08.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        System.out.println( new Hrivna().getAmount() );
    }

    public static abstract class Money
    {
        abstract Money getMoney();

        public Object getAmount()
        {
            return getMoney().getAmount();
        }
    }

    public static class Hrivna extends Money
    {
        public double amount = 123d;

        public Hrivna getMoney()
        {
            return this;
        }

        @Override
        public Money getAmount()
        {
            return getMoney(); // или return this;
        }
    }
}
