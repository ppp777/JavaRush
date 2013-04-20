package com.javarush.test.level10.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * JavaRush.ru
 * Level 10, Lesson 11, Bonus 01
 * <p/>
 * Нужно исправить программу, чтобы компилировалась и работала.
 * Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку), помещает их в
 * HashMap и выводит на экран содержимое HashMap.
 * <p/>
 * Date: 20.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        for ( int i = 0; i < 10; i++ )
        {
            int index = Integer.parseInt( reader.readLine() );
            String name = reader.readLine();
            map.put( index, name );
        }

        for ( Map.Entry<Integer, String> pair : map.entrySet() )
        {
            int id = pair.getKey();
            String name = pair.getValue();
            System.out.println( "Id=" + id + " Name=" + name );
        }
    }
}
