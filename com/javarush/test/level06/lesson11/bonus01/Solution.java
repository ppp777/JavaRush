package com.javarush.test.level06.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 06, Lesson 11, bonus 01
 * <p/>
 * Нужно исправить программу, чтобы компилировалась и работала.
 * Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "Max is 25".
 * <p/>
 * Date: 27.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static int max = 100;

    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int a = Integer.parseInt( reader.readLine() );
        int b = Integer.parseInt( reader.readLine() );

        int max = a > b ? a : b;
        System.out.println( "Max is " + max );
    }
}

//Исходный вариант:
//public class Solution
//{
//    public static int max = 100;
//    public static void main(String[] args) throws IOException
//    {
//        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
//
//        String max = "Max is ";
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        max = a > b ? a : b;
//
//        System.out.println(max + max);
//    }
//
//}