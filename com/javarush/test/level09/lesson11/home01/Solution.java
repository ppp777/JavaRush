package com.javarush.test.level09.lesson11.home01;

/**
 * JavaRush.ru
 * Level 09, Lesson 11, Home 01
 * <p/>
 * Написать метод, в котором происходит деление на ноль. Обернуть его вызов в try...catch.
 * <p/>
 * Date: 15.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main(String[] args)
    {
        int x =  5/0;
        System.out.println(x);
    }
}
