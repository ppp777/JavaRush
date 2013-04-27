package com.javarush.test.level12.lesson09.task03;

/**
 * JavaRush.ru
 * Level 12, Lesson 09, Task 03
 * <p/>
 * Напиши интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать). Добавь эти интерфейсы классам Cat(кот),
 * Fish(рыба), Bird(птица), Airplane(самолет).
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

    public abstract class Cat implements Run
    {
    }

    public abstract class Fish implements Swim
    {
    }

    public abstract class Bird implements Fly
    {
    }

    public abstract class Airplane implements Fly
    {
    }
}
