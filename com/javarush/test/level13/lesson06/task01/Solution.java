package com.javarush.test.level13.lesson06.task01;

/**
 * JavaRush.ru
 * Level 13, Lesson 06, Task 01
 * <p/>
 * 1. Создать классы Dog, Cat и Mouse.<b/>
 * 2. Реализовать интерфейсы в добавленных классах, учитывая что:<b/>
 * - Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.<b/>
 * - Мышь(Mouse) может передвигаться и может быть съедена.<b/>
 * - Собака(Dog) может передвигаться и съесть кого-то.<b/>
 * 3. Методы удалять нельзя!.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{

    public interface Moveable //может двигаться
    {
        void move();
    }

    public interface Eatable  //может быть съеден
    {
        void eaten();
    }

    public interface Eat  //может кого-нибудь съесть
    {
        void eat();
    }

    public static abstract class Dog implements Moveable, Eat
    {
    }

    public static abstract class Cat implements Moveable, Eat, Eatable
    {
    }

    public static abstract class Mouse implements Moveable, Eatable
    {
    }
}
