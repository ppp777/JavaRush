package com.javarush.test.level12.lesson12.home09;

/**
 * JavaRush.ru
 * Level 12, Lesson 12, Home 09
 * <p/>
 * Добавь такой класс-родитель к классу CTO, чтобы класс перестал быть абстрактным. Добавлять/реализовать методы
 * в класс CTO запрещается.
 * <p/>
 * Date: 28.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        CTO cto = new CTO();
        System.out.println( cto );
    }

    public static interface Businessman
    {
        public void workHard();
    }

    public static class Developer
    {
        public void workHard() {}
    }

    public static class CTO extends Developer implements Businessman
    {
    }
}
