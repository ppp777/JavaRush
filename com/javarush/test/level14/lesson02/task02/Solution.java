package com.javarush.test.level14.lesson02.task02;

/**
 * JavaRush.ru
 * Level 14, Lesson 02, Task 02
 * <p/>
 * Сказка Репка:<b/>
 * Исправьте строчку 'Cat o = new Cat();' так, чтобы программа вывела "Bingo!"
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Cat o = new TomCat();

        boolean isCat = o instanceof Cat;
        boolean isMoveable = o instanceof Moveable;
        boolean isTom = o instanceof TomCat;

        if ( isCat && isMoveable && isTom )
        {
            System.out.println( "Bingo!" );
        }

    }

    interface Moveable
    {
    }

    static class Cat
    {
    }

    static class TomCat extends Cat implements Moveable
    {

    }
}
