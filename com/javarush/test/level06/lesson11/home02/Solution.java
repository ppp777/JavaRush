/**
*
*JavaRush.ru
*Level 06, Lesson 11, home 02
*
* Создай класс кот - Cat. В нем создай статическую переменную cats (ArrayList<Cat>). Пусть при каждом создании кота
* в переменную cats добовляется этот новый кот. Создать 10 объектов Cat и вывести их всех на экран, пользуясь
* переменной cats
*
* Date: 27.01.13
* @author Sergey Kandalintsev
*
*/
package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            new Cat();
        }

        for (int i = 0; i < Cat.cats.size(); i++)
        {
            System.out.println(Cat.cats.get(i));
        }
    }

    public static class Cat
    {
        static ArrayList<Cat> cats = new ArrayList<Cat>();

        public Cat()
        {
            cats.add(this);
        }
    }

}
