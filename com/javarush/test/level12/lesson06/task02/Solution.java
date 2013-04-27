package com.javarush.test.level12.lesson06.task02;

/**
 * JavaRush.ru
 * Level 12, Lesson 06, Bonus 02
 * <p/>
 * Исправь код, чтобы программа компилировалась.
 * <p/>
 * Date: 27.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
    }

    public abstract class Pet
    {
        public String getName()
        {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
