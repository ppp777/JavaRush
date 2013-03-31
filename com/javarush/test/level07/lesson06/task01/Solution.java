/**
 *
 *JavaRush.ru
 *Level 07, Lesson 06, task 01
 *
 * Создай список строк. Добавь в него 5 различных строчек и выведи его размер и содержимое на экран.
 *
 * Date: 28.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    final static int LINES_QTY = 5; //Кол-во вводимых строк

    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        for (int i = 0; i < LINES_QTY; i++)
        {
            list.add( br.readLine() );
        }

        System.out.println( list.size() );
        System.out.println(list);

//        for (String s : list)
//        {
//            System.out.println(s);
//        }
    }
}

