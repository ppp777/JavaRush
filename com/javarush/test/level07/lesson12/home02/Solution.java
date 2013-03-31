/**
 *
 *JavaRush.ru
 *Level 07, Lesson 12, home02
 *
 * Введи с клавиатуры 10 строк. Переставить три первых в конец списка. Вывести список на экран.
 *
 * Date: 01.02.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution
{
    public static final int LINES_QTY = 10; //Кол-во вводимых строк

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < LINES_QTY; i++)
        {
            list.add( reader.readLine() );
        }

        list.add( list.remove(0) );
        list.add( list.remove(0) );
        list.add( list.remove(0) );

        for (String s : list)
        {
            System.out.println(s);
        }
    }
}
