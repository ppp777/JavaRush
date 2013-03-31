package com.javarush.test.level08.lesson03.task04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 *JavaRush.ru
 *Level 08, Lesson 03, task 04
 *
 *
 *  Есть коллекция HashMap<String, String>, туда занесли 10 различных строк. Вывести на экран список ключей.
 *
 *
 * Date: 05.02.13
 * @author Sergey Kandalintsev
 *
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            System.out.println(pair.getKey());
        }
    }
}

// Вариант с итератором:
//public class Solution
//{
//    public static void main(String[] args) throws Exception
//    {
//        HashMap<String, String> map = new HashMap<String, String>();
//
//        map.put("Sim", "Sim");
//        map.put("Tom", "Tom");
//        map.put("Arbus", "Arbus");
//        map.put("Baby", "Baby");
//        map.put("Cat", "Cat");
//        map.put("Dog", "Dog");
//        map.put("Eat", "Eat");
//        map.put("Food", "Food");
//        map.put("Gevey", "Gevey");
//        map.put("Hugs", "Hugs");
//
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext())
//        {
//            Map.Entry<String, String> pair = iterator.next();
//            System.out.println(pair.getKey());
//        }
//    }
//}