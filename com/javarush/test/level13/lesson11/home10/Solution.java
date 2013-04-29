package com.javarush.test.level13.lesson11.home10;

import java.awt.*;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Home 10
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

    public static class BigFox extends Fox
    {
        public Color getColor()
        {
            return Color.GRAY;
        }
    }
}
