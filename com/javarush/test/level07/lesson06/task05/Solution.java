/**
 *
 *JavaRush.ru
 *Level 07, Lesson 06, task 05
 *
 * Создай список строк. Добавь в него 5 строчек с клавиатуры. Удали последнюю строку и вставь её в начало.
 * Повторить 13 раз. Выведи содержимое на экран.
 *
 * Date: 29.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson06.task05;

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

        for (int i = 0; i < 13; i++)
        {
            list.add( 0, list.remove(LINES_QTY - 1) );
        }

        for (String s: list)
        {
            System.out.println(s);
        }
    }
}

