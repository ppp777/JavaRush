package com.javarush.test.level14.lesson02.task01;

/**
 * JavaRush.ru
 * Level 14, Lesson 02, Task 01
 * <p/>
 * Сказка Репка:<b/>
 * Исправьте строчку 'Object o = new Pet();' в методе main так, чтобы программа вывела "Bingo!"
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Object o = new Tiger();
        boolean isCat = o instanceof Cat;
        boolean isTiger = o instanceof Tiger;
        boolean isPet = o instanceof Pet;

        printResults( isCat, isTiger, isPet );
    }

    private static void printResults( boolean cat, boolean tiger, boolean pet )
    {
        if ( cat && tiger && pet )
        {
            System.out.println( "Bingo!" );
        }
    }

    static class Pet
    {
    }

    static class Cat extends Pet
    {
    }

    static class Tiger extends Cat
    {
    }

}
