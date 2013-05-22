package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 06, Lesson 08, Task 04
 * <p/>
 * Сделать класс ConsoleReader, у которого будут 4 статических метода:
 * String readString() – читает с клавиатуры строку
 * int readInt() – читает с клавиатуры число
 * double readDouble()– читает с клавиатуры дробное число
 * void readLn() – ждёт нажатия enter
 * <p/>
 * Date: 26.01.13
 * @author Sergey Kandalintsev
 */
public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        return br.readLine();
    }

    public static int readInt() throws Exception
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        return Integer.parseInt( br.readLine() );
    }

    public static double readDouble() throws Exception
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        return Double.parseDouble( br.readLine() );
    }

    public static void readLn() throws Exception
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        while ( br.read() != '\n' )
        {
            ;
        }
    }
}

