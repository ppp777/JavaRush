package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/**
 * JavaRush.ru
 * Level 08, Lesson 11, Home 03
 * <p/>
 * Создать словарь Map(<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя". Пусть среди этих 10 человек
 * есть люди с одинаковыми именами и/или фамилиями. Вывести содержимое Map на экран.
 * <p/>
 * Date: 08.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Map<String, String> map = createPeopleList();
        printPeopleList( map );
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> people = new HashMap<String, String>();

        people.put( "Ivanov", "Ivan" );
        people.put( "Ivanov", "Petr" );
        people.put( "Sidorov", "Ivan" );
        people.put( "Semenov", "Sergey" );
        people.put( "Frolov", "Igor" );
        people.put( "Sergeev", "Igor" );
        people.put( "Kostenko", "Alexey" );
        people.put( "Petrenko", "Sergey" );
        people.put( "Dmitriev", "Sergey" );
        people.put( "Nikonov", "Petr" );

        return people;
    }

    public static void printPeopleList( Map<String, String> map )
    {
        for ( Map.Entry<String, String> s : map.entrySet() )
        {
            System.out.println( s.getKey() + " " + s.getValue() );
        }
    }
}
