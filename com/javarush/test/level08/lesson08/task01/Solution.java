package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/**
 *
 *JavaRush.ru
 *Level 08, Lesson 08, Task 01
 *
 * Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
 *
 * Date: 13.02.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> stringSet = new HashSet<String>();

        stringSet.add("Лайка");
        stringSet.add("Лейка");
        stringSet.add("Любовь");
        stringSet.add("Львов");
        stringSet.add("Люкс");
        stringSet.add("Лира");
        stringSet.add("Лонжерон");
        stringSet.add("Ленинград");
        stringSet.add("Лампа");
        stringSet.add("Линейка");
        stringSet.add("Логарифм");
        stringSet.add("Лайкра");
        stringSet.add("Лимб");
        stringSet.add("Лямбда");
        stringSet.add("Лена");
        stringSet.add("Лох");
        stringSet.add("Локомотив");
        stringSet.add("Лунаход");
        stringSet.add("Лоза");
        stringSet.add("Лаванда");
        return stringSet;
    }
}
