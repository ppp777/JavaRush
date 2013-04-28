package com.javarush.test.level13.lesson02.task05;

/**
 * JavaRush.ru
 * Level 13, Lesson 02, Task 05
 * <p/>
 * Исправьте 4 ошибки в программе, чтобы она компилировалась
 * <p/>
 * Date: 28.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    static int INDEX = 1;

    public static void main( String[] args ) throws Exception
    {
        System.out.println( new Hobbie().HOBBIE.toString() );
        System.out.println( new Hobbie().toString() );
    }

    interface Desire
    {
    }

    interface Dream
    {
        Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Desire, Dream
    {
        @Override
        public String toString()
        {
            INDEX++;
            return "" + INDEX;
        }
    }
}

// Исходный вариант:
//public class Solution
//{
//
//    public static void main( String[] args ) throws Exception
//    {
//        System.out.println( new Dream().HOBBIE.toString() );
//        System.out.println( new Hobbie().toString() );
//    }
//
//    interface Desire
//    {
//    }
//
//    interface Dream
//    {
//        private static Hobbie HOBBIE = new Hobbie();
//    }
//
//    class Hobbie extends Desire implements Dream
//    {
//        static int INDEX = 1;
//
//        @Override
//        public String toString()
//        {
//            INDEX++;
//            return "" + INDEX;
//        }
//    }
//}