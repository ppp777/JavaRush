package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * JavaRush.ru
 * Level 09, Lesson 11, Home 03
 * <p/>
 * Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод. Обернуть все тело (весь
 * код) этого метода в try..catch. Если пользователь ввел какой-то текст, вместо ввода числа, функция должна
 * перехватить исключение и вывести все введенные числа в качестве результата.
 * <p/>
 * Date: 15.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        readData();
    }

    public static void readData()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) )
        {
            while ( true )
            {
                int nextNumber = Integer.parseInt( reader.readLine() );
                numbers.add( nextNumber );
            }
        }
        catch ( IOException | NumberFormatException e )
        {
            for ( int n : numbers )
            {
                System.out.println( n );
            }
        }
    }
}
