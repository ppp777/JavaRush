package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * JavaRush.ru
 * Level 07, Lesson 12, home04
 * <p/>
 * Создать список строк. Ввести строки с клавиатуры и добавить их в список. Вводить с клавиатуры строки, пока
 * пользователь не введет пустую строку (нажмет Enter). Вывести строки на экран.
 * <p/>
 * Date: 01.02.13
 * @author Sergey Kandalintsev
 */

public class Solution
{
    public static void main( String[] args ) throws IOException
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        for ( String s = reader.readLine(); !s.isEmpty(); s = reader.readLine() )
        {
            list.add( s );
        }

        for ( String s : list )
        {
            System.out.println( s );
        }
    }
}
