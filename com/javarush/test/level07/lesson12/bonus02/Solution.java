package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 *JavaRush.ru
 *Level 07, Lesson 12, home02
 *
 *
 * Программа вводит строки, пока пользователь не введет пустую строку. Потом программа строит новый список. Если в
 * строке четное число букв, она удваиваеться, если нечетное - утраивается.
 *
 *
 * Date: 02.02.13
 * @author Sergey Kandalintsev
 *
 */
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> newList = new ArrayList<String>();

        while (true)
        {
            String s = reader.readLine();
            if ( s.isEmpty() )
            {
                break;
            }
            list.add(s);
        }

        for (String s : list)
        {
            newList.add((s.length() % 2 == 0) ? s + " " + s
                                              : s + " " + s + " " + s);
        }

        for (String s : newList)
        {
            System.out.println(s);
        }
    }
}
