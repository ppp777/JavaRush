package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * JavaRush.ru
 * Level 10, Lesson 11, Bonus 01
 * <p/>
 * Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
 * Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap. Пустая строка –
 * конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
 * Затем программа выводит содержание HashMap на экран.
 * Пример ввода:
 * 1
 * Мама
 * 2
 * Рама
 * <p/>
 * Пример вывода:
 * 1 Мама
 * 2 Рама
 * <p/>
 * Date: 09.06.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        while ( true )
        {
            try
            {
                int id = Integer.parseInt( reader.readLine() );
                String name = reader.readLine();

                if ( name.equals( "" ) )
                {
                    break;
                }
                map.put( name, id );
            }
            catch ( NumberFormatException | IOException e )
            {
                break;
            }
        }

        for ( Map.Entry<String, Integer> pair : map.entrySet() )
        {
            String name = pair.getKey();
            int id = pair.getValue();
            System.out.println( id + " " + name );
        }
    }
}
