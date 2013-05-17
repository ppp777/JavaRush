package com.javarush.test.level06.lesson05.task03;

/**
 * JavaRush.ru
 * Level 06, Lesson 05, Task 03
 * <p/>
 * Создать в цикле 10000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые и метод finalize
 * хоть раз да вызовется).
 * <p/>
 * Date: 26.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        for ( int i = 0; i < 10000; i++ )
        {
            new Cat();
            new Dog();
        }
    }
}

class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println( "Cat destroyed" );
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println( "Dog destroyed" );
    }
}
