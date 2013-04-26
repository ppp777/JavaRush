package com.javarush.test.level12.lesson02.task03;

/**
 * JavaRush.ru
 * Level 12, Lesson 02, Task 03
 * <p/>
 * Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
 * <p/>
 * Date: 25.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet
    {
        public Pet getChild()
        {
            return new Pet();
        }
    }

    public static class Cat extends Pet
    {
        @Override
        public Pet getChild()
        {
            return new Cat();
        }
    }

    public static class Dog extends Pet
    {
        @Override
        public Pet getChild()
        {
            return new Dog();
        }
    }
}
