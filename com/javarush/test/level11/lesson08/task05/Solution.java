package com.javarush.test.level11.lesson08.task05;

/**
 * JavaRush.ru
 * Level 11, Lesson 08, Task 05
 * <p/>
 * Посмотри внимательно на методы и добавь недостающие переменные.
 * <p/>
 * Date: 24.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
    }

    public class Cat
    {
        private String name;
        private int age;
        private int weight;
        private int speed;

        public Cat( String name, int age, int weight )
        {
            this.name = name;
            this.age = age;
            this.weight = weight;

        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public void setWeight( int weight )
        {
            this.weight = weight;
        }

        public void setSpeed( int speed )
        {
            this.speed = speed;
        }
    }
}
