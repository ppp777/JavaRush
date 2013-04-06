package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 08, Lesson 06, Task 05
 * Написать функцию, которая возвращает список, который лучше всего подходит для выполнения данных операций
 * (быстрее всего справится с большим количеством операций).
 * Date: 06.03.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static List getListForGet()
    {
        return new ArrayList<Object>();
    }

    public static List getListForSet()
    {
        return new ArrayList<Object>();
    }

    public static List getListForAddOrInsert()
    {
        return new LinkedList<Object>();
    }

    public static List getListForRemove()
    {
        return new LinkedList<Object>();
    }
}

