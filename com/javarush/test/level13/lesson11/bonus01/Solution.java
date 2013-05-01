package com.javarush.test.level13.lesson11.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Home 01
 * <p/>
 * Сортировка четных чисел из файла <b/>
 * 1. Ввести имя файла с консоли. <b/>
 * 2. Прочитать из него набор чисел. <b/>
 * 3. Вывести на консоль только четные, отсортированные по возрастанию. <b/>
 * Пример ввода: <b/>
 * 5 <b/>
 * 8 <b/>
 * 11 <b/>
 * 3 <b/>
 * 2 <b/>
 * 10 <b/>
 * Пример вывода: <b/>
 * 2 <b/>
 * 8 <b/>
 * 10
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String fileName = reader.readLine();
        reader = new BufferedReader( new InputStreamReader( new FileInputStream( fileName ) ) );

        List<Integer> numbers = new ArrayList<Integer>();

        while ( reader.ready() )
        {
            int nextNumber = Integer.parseInt( reader.readLine() );
            if ( nextNumber % 2 == 0 )
            {
                numbers.add( nextNumber );
            }
        }

        reader.close();
        sort( numbers );

        for ( int x : numbers )
        {
            System.out.println( x );
        }
    }

    public static void sort( List<Integer> numbers )
    {
        for ( int i = 0; i < numbers.size() - 1; i++ )
        {
            for ( int j = 0; j < numbers.size() - i - 1; j++ )
            {
                if ( numbers.get( j ) > numbers.get( j + 1 ) )
                {
                    int tmp = numbers.get( j );
                    numbers.set( j, numbers.get( j + 1 ) );
                    numbers.set( j + 1, tmp );
                }
            }
        }
    }
}
