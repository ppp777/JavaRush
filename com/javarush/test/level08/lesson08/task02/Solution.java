package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 *JavaRush.ru
 *Level 08, Lesson 08, Task 02
 *
 * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 *
 * Date: 13.02.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = createSet();

//        for (Integer i : set)
//            System.out.println(i);

        System.out.println();
        System.out.println();

        removeAllNumbersMoreThen10(set);

        for (Integer i : set)
            System.out.println(i);
    }

    public static HashSet<Integer> createSet()
    {
        Set<Integer> integerSet = new HashSet<Integer>();
        Random rd = new Random();

        for (int i = 0; i < 20; i++)
        {
            integerSet.add(rd.nextInt(40));
            System.out.println(i);
        }

        return (HashSet<Integer>) integerSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThen10(HashSet<Integer> set)
    {

        for (Integer setElement : set)
        {
            if (setElement > 10)
            {
                set.remove(setElement);
            }
        }

        return set;

    }
}

