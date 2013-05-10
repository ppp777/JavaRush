package com.javarush.test.level08.lesson03.task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * JavaRush.ru
 * Level 08, Lesson 03, task 02
 * <p/>
 * Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода,
 * груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок,
 * картофель – клубень. Вывести содержимое коллекции на экран.
 * Пример вывода (тут показана только одна строка):
 * Картофель - овощ
 * <p/>
 * Date: 04.02.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        Map<String, String> map = new HashMap<String, String>();

        map.put( "арбуз",       "ягода" );
        map.put( "банан",       "трава" );
        map.put( "вишня",       "ягода" );
        map.put( "груша",       "фрукт" );
        map.put( "дыня",        "овощ" );
        map.put( "ежевика",     "куст" );
        map.put( "жень-шень",   "корень" );
        map.put( "земляника",   "ягода" );
        map.put( "ирис",        "цветок" );
        map.put( "картофель",   "клубень" );

        for ( Map.Entry<String, String> pair : map.entrySet() )
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println( key + " - " + value );
        }
    }
}


//    Вариант с итератором:
//public class Solution
//{
//    public static void main(String[] args) throws Exception
//    {
//        Map<String, String> map = new HashMap<String, String>();
//
//        map.put("арбуз",        "ягода");
//        map.put("банан",        "трава");
//        map.put("вишня",        "ягода");
//        map.put("груша",        "фрукт");
//        map.put("дыня",         "овощ");
//        map.put("ежевика",      "куст");
//        map.put("жень-шень",    "корень");
//        map.put("земляника",    "ягода");
//        map.put("ирис",         "цветок");
//        map.put("картофель",    "клубень");
//
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext())
//        {
//            Map.Entry<String, String> pair = iterator.next();
//            String key = pair.getKey();
//            String value = pair.getValue();
//            System.out.println(key + " - " + value);
//        }
//    }
//}