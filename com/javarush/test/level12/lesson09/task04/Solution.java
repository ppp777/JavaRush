package com.javarush.test.level12.lesson09.task04;

/**
 * JavaRush.ru
 * Level 12, Lesson 09, Task 04
 * <p/>
 * Напиши интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать). Добавь эти интерфейсы классам Human(человек),
 * Duck(утка), Penguin(пингвин), Airplane(самолет).
 * <p/>
 * Date: 27.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
    }

    public interface Fly
    {
        public void fly();
    }

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }

    public abstract class Human implements Run, Swim
    {
    }

    public abstract class Duck implements Run, Swim, Fly
    {
    }

    public abstract class Penguin implements Run, Swim
    {
    }

    public abstract class Airplane implements Fly
    {
    }
}
