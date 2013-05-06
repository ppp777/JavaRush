package com.javarush.test.level15.lesson04.task04;

/**
 * JavaRush.ru
 * Level 15, Lesson 04, Task 04
 * <p/>
 * 1. В методе main создать 2 человека man и woman. man с типом Man, woman с типом Woman. <b/>
 * 2. Изменить метод printName так, чтобы он выполнялся для man и woman. <b/>
 * 3. Реализация метода printName должна быть одна.
 * <p/>
 * Date: 06.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Man man = new Man();
        Woman woman = new Woman();

        printName( man );
        printName( woman );
    }

    public static void printName( Human human )
    {
        System.out.println(human);
    }

    public static class Human
    {

    }

    public static class Man extends Human
    {

    }

    public static class Woman extends Human
    {

    }
}
