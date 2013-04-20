package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * JavaRush.ru
 * Level 10, Lesson 11, Home 05
 * <p/>
 * Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита). Вывести
 * результат на экран. <b/>
 * Пример вывода: <b/>
 * a 5 <b/>
 * б 8 <b/>
 * в 3 <b/>
 * ... <b/>
 * я 9
 * <p/>
 * Date: 19.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int[] charCount = new int[33];

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for ( int i = 0; i < 32; i++ )
        {
            alphabet.add( ( char ) ( 'а' + i ) );
        }
        alphabet.add( 6, 'ё' );

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for ( int i = 0; i < 10; i++ )
        {
            String s = reader.readLine();
            list.add( s.toLowerCase() );
        }

        //подсчет букв
        for ( int i = 0; i < list.size(); i++ )
        {
            char[] nextString = list.get( i ).toCharArray();
            for ( int j = 0; j < nextString.length; j++ )
            {
                int index = alphabet.indexOf( nextString[j] );
                charCount[index]++;
            }
        }
        for ( int i = 0; i < charCount.length; i++ )
        {
            System.out.println( alphabet.get( i ) + " " + charCount[i] );
        }
    }
}
