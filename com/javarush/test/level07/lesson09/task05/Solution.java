/**
 *
 *JavaRush.ru
 *Level 07, Lesson 09, task 05
 *
 * Введи с клавиатуры 10 слов в массив строк. Удвой их по принципу a,b,c -> a,a,b,b,c,c. Выведи результат на экран.
 *
 * Date: 31.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static final int LINES_QTY = 10; //Кол-во вводимых строк

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < LINES_QTY; i++)
        {
            String s = br.readLine();
            list.add(s);
            list.add(s);
        }

        for ( String s : list)
        {
            System.out.println(s);
        }
    }
}


// Второй вариант:
//public class Solution
//{
//    public static final int LINES_QTY = 10; //Кол-во вводимых строк
//
//    public static void main(String[] args) throws Exception
//    {
//        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
//        ArrayList<String> list = new ArrayList<String>();
//
//        for (int i = 0; i < LINES_QTY; i++)
//        {
//            String s = br.readLine();
//            list.add(s);
//        }
//
//        for (int i = 0; i < list.size(); )
//        {
//            list.add( i, list.get(i) );
//            i += 2;
//        }
//
//        for ( String s : list)
//        {
//            System.out.println(s);
//        }
//    }
//}