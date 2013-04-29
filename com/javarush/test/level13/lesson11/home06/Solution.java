package com.javarush.test.level13.lesson11.home06;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Home 05
 * <p/>
 * 1. Переделайте наследование  в классах и интерфейсах так, чтобы программа компилировалась и продолжала делать
 * то же самое.<b/>
 * 2. Класс Hobbie должен наследоваться от интерфейсов Desire, Dream.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{

    public static void main( String[] args ) throws Exception
    {
        System.out.println( Dream.HOBBIE.toString() );
        System.out.println( new Hobbie().INDEX );
    }

    interface Desire
    {
    }

    interface Dream
    {
        static Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Desire, Dream
    {
        static int INDEX = 1;

        @Override
        public String toString()
        {
            INDEX++;
            return "" + INDEX;
        }
    }
}
