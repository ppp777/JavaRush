package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/**
 * JavaRush.ru
 * Level 07, Lesson 06, task 01
 * <p/>
 * Создай список строк. Добавь в него 5 различных строчек и выведи его размер и содержимое на экран.
 * <p/>
 * Date: 28.01.13
 * @author Sergey Kandalintsev
 */

public class Solution
{
    final static int LINES_QTY = 5; //Кол-во вводимых строк

    public static void main( String[] args ) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();

        for ( int i = 0; i < LINES_QTY; i++ )
        {
            list.add( "String" + i );
        }

        System.out.println( list.size() );
        System.out.println( list );
    }
}

