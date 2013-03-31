package com.javarush.test.level08.lesson03.task06;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *JavaRush.ru
 *Level 08, Lesson 03, task 06
 *
 *
 *  Есть коллекция HashMap<Object, Object>, туда занесли 10 различных пар объектов.  Вывести содержимое коллекции
 *  на экран. Пример вывода (тут показана только одна строка):
 *  Sim – 5
 *
 *
 * Date: 06.02.13
 * @author Sergey Kandalintsev
 *
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);

        for (Map.Entry<String, Object> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}


// Вариант с итератором
//public class Solution
//{
//    public static void main(String[] args) throws Exception
//    {
//        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("Sim", 5);
//        map.put("Tom", 5.5);
//        map.put("Arbus", false);
//        map.put("Baby", null);
//        map.put("Cat", "Cat");
//        map.put("Eat", new Long(56));
//        map.put("Food", new Character('3'));
//        map.put("Gevey", '6');
//        map.put("Hugs", 111111111111L);
//
//        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext())
//        {
//            Map.Entry<String, Object> pair = iterator.next();
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
//    }
//}
