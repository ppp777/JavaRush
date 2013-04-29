package com.javarush.test.level13.lesson04.task04;

import java.awt.*;

/**
 * JavaRush.ru
 * Level 13, Lesson 04, Task 04
 * <p/>
 * 1. Исправьте класс BigFox так, чтобы программа компилировалась.<b/>
 * 2. Метод main менять нельзя.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        Fox bigFox = new BigFox();
        System.out.println( bigFox.getName() );
        System.out.println( bigFox.getColor() );
    }

    public interface Animal
    {
        Color getColor();
    }

    public static abstract class Fox implements Animal
    {
        public String getName()
        {
            return "Fox";
        }
    }

    //add your code below
    public static class BigFox extends Fox
    {
        public Color getColor()
        {
            return Color.GRAY;
        }
    }
}
