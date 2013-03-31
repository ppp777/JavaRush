/**
 *
 *JavaRush.ru
 *Level 07, Lesson 09, task 03
 *
 * Создай список из слов «мама», «мыла», «раму». Вставь в список после каждого слова, строку содержащую
 * слово «именно». Вывести результат на экран.
 *
 * Date: 31.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();

        Collections.addAll(list, "мама", "мыла", "раму");
        list.add(1, "именно");
        list.add(3, "именно");
        list.add("именно");

        for (String s : list)
        {
            System.out.println(s);
        }
    }
}

