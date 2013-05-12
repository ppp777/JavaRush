package com.javarush.test.level04.lesson06.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 04, Lesson 06, Task 04
 * <p/>
 * Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если их длины равны –
 * вывести сообщение – «Длины имён равны»
 * <p/>
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String firstName = reader.readLine();
        String secondName = reader.readLine();

        if ( firstName.equals( secondName ) )
        {
            System.out.println( "Имена идентичны" );
        }
        if ( firstName.length() == secondName.length() )
        {
            System.out.println( "Длины имён равны" );
        }
    }
}
