package com.javarush.test.level11.lesson08.task02;

/**
 * JavaRush.ru
 * Level 11, Lesson 08, Task 02
 * <p/>
 * Скрыть все внутренние переменные класса Cat, но только те, к которым остается доступ с помощью методов.
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
        public int weight;

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

        public void setName( String name )
        {
            this.name = name;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge( int age )
        {
            this.age = age;
        }
    }
}