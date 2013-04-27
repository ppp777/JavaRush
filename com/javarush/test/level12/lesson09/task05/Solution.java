package com.javarush.test.level12.lesson09.task05;

/**
 * JavaRush.ru
 * Level 12, Lesson 09, Task 05
 * <p/>
 * Напиши класс Human(человек) и интерфейсы Run(бежать/ездить), Swim(плавать).Добавь в каждый интерфейс по одному
 * методу. Добавь эти интерфейсы классу Human, но не реализуй методы. Объяви классу Human абстрактным.
 * <p/>
 * Date: 27.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
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
}
