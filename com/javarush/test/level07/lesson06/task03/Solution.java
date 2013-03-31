/**
 *
 *JavaRush.ru
 *Level 07, Lesson 06, task 03
 *
 * Создай список строк. Добавь в него 5 строчек с клавиатуры. Расположи их в обратном порядке.
 * Выведи содержимое на экран.
 *
 * Date: 29.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    final static int LINES_QTY = 5; //Кол-во вводимых строк

    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        for (int i = 0; i < LINES_QTY; i++)
        {
            list.add( 0, br.readLine() );
        }

        for (String s: list)
        {
            System.out.println(s);
        }
    }
}
