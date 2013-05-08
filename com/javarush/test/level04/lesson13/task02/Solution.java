package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 04, Lesson 13, Task 02
 * <p/>
 * Ввести с клавиатуры два числа m и n. Вывести на экран прямоугольник размером m на n из восьмёрок(‘8’)
 * <p/>
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        int m = Integer.parseInt( br.readLine() );
        int n = Integer.parseInt( br.readLine() );

        for ( int i = 0; i < m; i++ )
        {
            for ( int j = 0; j < n; j++ )
            {
                System.out.print( "8" );
            }
            System.out.println();
        }
    }
}
