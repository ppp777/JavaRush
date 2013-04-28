package com.javarush.test.level12.lesson12.home08;

/**
 * JavaRush.ru
 * Level 12, Lesson 12, Home 08
 * <p/>
 * Добавь как можно больше интерфейсов к классу Human, но чтобы он не становился абстрактным классом. Добавлять методы
 * в класс Human запрещается.
 * <p/>
 * Date: 28.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Human human = new Human();
        System.out.println( human );
    }

    public static interface Worker
    {
        public void workLazy();
    }

    public static interface Businessman
    {
        public void workHard();
    }

    public static interface Secretary
    {
        public void workLazy();
    }

    public static interface Miner
    {
        public void workVeryHard();
    }

    public static class Human implements Worker, Businessman, Secretary
    {

        public void workHard()
        {
        }

        public void workLazy()
        {
        }
    }
}
