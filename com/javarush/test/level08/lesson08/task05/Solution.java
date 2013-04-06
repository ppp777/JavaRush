package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/**
 * JavaRush.ru
 * Level 08, Lesson 08, Task 05
 * <p/>
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия»- «имя».
 * Удалить людей, имеющих одинаковые имена.
 * <p/>
 * Date: 06.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates( HashMap<String, String> map )
    {
        //Напишите тут ваш код
    }

    public static void removeItemFromMapByValue( HashMap<String, String> map, String value )
    {
        HashMap<String, String> copy = new HashMap<String, String>( map );
        for ( Map.Entry<String, String> pair : copy.entrySet() )
        {
            if ( pair.getValue().equals( value ) )
            {
                map.remove( pair.getKey() );
            }
        }
    }
}


