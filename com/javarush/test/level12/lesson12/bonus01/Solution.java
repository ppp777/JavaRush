package com.javarush.test.level12.lesson12.bonus01;

/**
 * JavaRush.ru
 * Level 12, Lesson 12, Bonus 01
 * <p/>
 * Нужно исправить программу чтобы компилировалась и работала. <b/>
 * Расставить правильно ключевые слова abstract, чтобы программа компилировалась.
 * Date: 26.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{

    public static void main( String[] args )
    {
        Horse horse = new Pegas();
        horse.run();
    }

    public static interface Fly
    {
        public abstract void fly();
    }

    public static abstract class Horse
    {
        public void run()
        {
        }
    }

    public static class Pegas extends Horse implements Fly
    {
        public void fly()
        {
        }
    }

    public static abstract class SwimPegas extends Pegas
    {
        public abstract void swim();
    }
}


// Исходный вариант:
//public class Solution
//{
//
//    public static void main( String[] args )
//    {
//        Horse horse = new Pegas();
//        horse.run();
//    }
//
//    public static interface Fly
//    {
//        public abstract void fly();
//    }
//
//    public static abstract class Horse
//    {
//        public void run()
//        {
//        }
//    }
//
//    public static class Pegas extends Horse implements Fly
//    {
//        public abstract void fly()
//        {
//
//        }
//    }
//
//    public static class SwimPegas extends Pegas
//    {
//        public void swim();
//    }
//
//}