package com.javarush.test.level12.lesson12.bonus02;

/**
 * JavaRush.ru
 * Level 11, Lesson 11, Bonus 02
 * <p/>
 * Нужно добавить в программу новую функциональность. <b/>
 * Сделать класс Pegas на основе класса Horse и интерфейса Fly.
 * <p/>
 * Date: 27.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Pegas horse = new Pegas();
    }

    public static interface Fly
    {
        public void fly();
    }

    public static class Horse
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
}
