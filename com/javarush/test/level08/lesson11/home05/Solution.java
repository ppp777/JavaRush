package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 08, Lesson 11, Home 05
 * <p/>
 * Написать программу, которая вводит с клавиатуры строку текста. Программа заменяет в тексте первые буквы всех слов на
 * заглавные.
 * Пример ввода:
 * Мама мыла раму.
 * Пример вывода:
 * Мама Мыла Раму.
 * <p/>
 * Date: 08.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String s = reader.readLine();
        //String s = "Мама мыла раму.";
        String result = "";
        char[] letters = s.toCharArray();

        for ( int i = 0; i < letters.length; i++ )
        {
            if ( !Character.isAlphabetic( letters[i] ) )
            {
                result += letters[i];
                continue;
            }
            result += Character.toUpperCase( letters[i++] );
            while ( i < letters.length && Character.isAlphabetic( letters[i] ) )
            {
                result += letters[i++];
            }

            if ( i < letters.length )
            {
                result += letters[i];
            }
        }

        System.out.println( result );
    }
}