package com.javarush.test.level09.lesson06.task05;

import java.util.HashMap;

/**
 * JavaRush.ru
 * Level 09, Lesson 06, Task 05
 * <p/>
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода: <br />
 * HashMap<String, String> map = new HashMap<String, String>(null); <br />
 * map.put(null, null); <br />
 * map.remove(null); <br />
 * <p/>
 * Date: 09.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        //Напишите тут ваш код

        HashMap<String, String> map = new HashMap<String, String>( null );
        map.put( null, null );
        map.remove( null );

        //Напишите тут ваш код

    }
}
