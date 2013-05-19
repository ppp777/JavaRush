package com.javarush.test.level06.lesson08.task01;

/**
 * JavaRush.ru
 * Level 06, Lesson 08, Task 01
 * <p/>
 * Создать класс Cat, в нем статическую переменную catCount. В конструкторе класса Cat, нужно увеличивать
 * данную переменную на 1, при создании нового объекта.
 * <p/>
 * Date: 26.01.13
 * @author Sergey Kandalintsev
 */
public class Cat
{
    static int catCount;

    public Cat()
    {
        catCount++;
    }
}
