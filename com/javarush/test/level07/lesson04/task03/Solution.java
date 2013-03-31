/**
 *
 *JavaRush.ru
 *Level 07, Lesson 04, task 03
 *
 * Создать массив на 10 строк. Создать массив на 10 чисел. Ввести с клавиатуры 10 строк. В массив чисел,
 * в каждую ячейку записать длину строки из массива строк, с таким же индексом/номером ячейки.
 * Вывести содержимое массива чисел на экран.
 *
 * Date: 28.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    final static int LINES_QTY = 10; //Кол-во строк в массивах

    public static void main(String[] args) throws Exception
    {
        String[] s = new String[LINES_QTY];
        int[] sLength = new int[LINES_QTY];
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        for (int i = 0; i < s.length; i++)
        {
            s[i] = br.readLine();
            sLength[i] = s[i].length();
        }

        System.out.println();
        for (int i = 0; i < s.length; i++)
        {
            System.out.println(sLength[i]);
        }
    }
}


