package com.javarush.test.level08.lesson03.task01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 *JavaRush.ru
 *Level 08, Lesson 03, task 01
 *
 *
 * Создать коллекцию HashSet с типом элементов String. Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня,
 * ежевика, жень-шень, земляника, ирис, картофель. Вывести содержимое коллекции на экран.
 * Посмотреть, как изменился порядок добавленных элементов.
 *
 *
 * Date: 03.02.13
 * @author Sergey Kandalintsev
 *
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String text : set)
        {
            System.out.println(text);
        }
    }
}


//    Вариант с итератором:
//    public static void main(String[] args) throws Exception
//    {
//        Set<String> set = new HashSet<String>();
//        set.add("арбуз");
//        set.add("банан");
//        set.add("вишня");
//        set.add("груша");
//        set.add("дыня");
//        set.add("ежевика");
//        set.add("жень-шень");
//        set.add("земляника");
//        set.add("ирис");
//        set.add("картофель");
//
//        Iterator<String> iterator = set.iterator();
//
//        while (iterator.hasNext())
//        {
//            String text = iterator.next();
//            System.out.println(text);
//        }
//    }


