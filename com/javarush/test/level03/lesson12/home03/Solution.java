package com.javarush.test.level03.lesson12.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 03, Lesson 12, Home 02
 * <br>
 * Ввести с клавиатуры число n. Вывести на экран надпись "Я буду зарабатывать $n в час".
 * Пример:
 * "Я буду зарабатывать $50 в час"
 * <br>
 * Date: 09.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int amount = Integer.parseInt( reader.readLine() );

        System.out.println( "Я буду зарабатывать $" + amount + " в час" );
    }
}