package com.javarush.test.level11.lesson08.task04;

/**
 * JavaRush.ru
 * Level 11, Lesson 08, Task 04
 * <p/>
 * Скрыть все внутренние переменные класса Cat и Dog. Также скрыть все методы, кроме тех, с помощью которых эти
 * классы взаимодействуют друг с другом.
 * <p/>
 * Date: 24.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main(String[] args)
    {
        Cat cat = new Cat("Vaska",5);
        Dog dog = new Dog("Sharik",4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }

    public static class Cat
    {
        private String name;
        private int speed;

        public Cat(String name, int speed)
        {
            this.name = name;
            this.speed = speed;
        }

        private String getName()
        {
            return name;
        }

        private int getSpeed()
        {
            return speed;
        }

        public boolean isDogNear(Dog dog)
        {
            return this.speed > dog.getSpeed();
        }
    }

    public static  class Dog
    {
        private String name;
        private int speed;

        public Dog(String name, int speed)
        {
            this.name = name;
            this.speed = speed;
        }

        private String getName()
        {
            return name;
        }

        private int getSpeed()
        {
            return speed;
        }

        public boolean isCatNear(Cat cat)
        {
            return this.speed > cat.getSpeed();
        }
    }
}
