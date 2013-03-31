/**
 *
 *JavaRush.ru
 *Level 07, Lesson 09, task 02
 *
 * Введи с клавиатуры 5 слов в массив строк. Выведи их в обратном порядке.
 *
 * Date: 31.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static final int LINES_QTY = 5; //Кол-во вводимых строк

    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        for (int i = 0; i < LINES_QTY; i++)
        {
            list.add( br.readLine() );
        }

        for (int i = LINES_QTY - 1; i >= 0; i-- )
        {
            System.out.println(list.get(i));
        }
    }
}

