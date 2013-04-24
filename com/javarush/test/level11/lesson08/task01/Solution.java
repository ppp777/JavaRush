package com.javarush.test.level11.lesson08.task01;

/**
 * JavaRush.ru
 * Level 11, Lesson 08, Task 01
 * <p/>
 * Скрыть все внутренние переменные класса Cat.
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

        public Cat()
        {
        }

        public Cat( String name, int age, int weight )
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}
