package com.javarush.test.level05.lesson12.bonus01;

import java.io.*;

/**
 * JavaRush.ru
 * Level 05, Lesson 12, bonus 01
 * <p/>
 * Нужно исправить программу, чтобы компилировалась и работала.
 * Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
 * <p/>
 * Date: 25.01.13
 * @author Sergey Kandalintsev
 */

public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int a = Integer.parseInt( reader.readLine() );
        int b = Integer.parseInt( reader.readLine() );
        int sum = a + b;

        System.out.println( "Sum = " + sum );
    }
}


//Исходный текст программы:
//public class Solution
//{
//    public static void main(String[] args)
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = reader.readLine();
//        int b = reader.read();
//
//        int sum = a + b;
//        System.out.println("Sum = " + sum);
//    }
//}