package com.javarush.test.level12.lesson12.home07;

/**
 * JavaRush.ru
 * Level 12, Lesson 12, Home 07
 * <p/>
 * Напиши интерфейсы Fly, Run, Swim. Добавь эти интерфейсы классам Duck, Penguin, Toad, CaptainJackSparrow.
 * <p/>
 * Date: 28.04.13
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

    public class Duck implements Swim, Fly
    {
        public void swim()
        {
        }

        public void fly()
        {
        }
    }

    public class Penguin implements Swim, Run
    {
        public void swim()
        {
        }

        public void run()
        {
        }
    }

    public class Toad implements Swim
    {
        public void swim()
        {
        }
    }

    public class CaptainJackSparrow implements Run, Swim, Fly
    {
        public void swim()
        {
        }

        public void fly()
        {
        }

        public void run()
        {
        }
    }
}
