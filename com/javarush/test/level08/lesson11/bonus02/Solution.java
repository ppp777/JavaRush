package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 08, Lesson 11, Bonus 02
 * <p/>
 * Нужно добавить в программу новую функциональность.
 * Задача: Программа определяет какая семья (фамилия) живет в доме с указанным номером.
 * Новая задача: Программа должна работать не с номерами домов, а с городами:
 * Пример ввода:
 * Москва
 * Ивановы
 * Киев
 * Петровы
 * Лондон
 * Абрамовичи
 * <p/>
 * Лондон
 * <p/>
 * Пример вывода:
 * Абрамовичи
 * <p/>
 * Date: 08.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while ( true )
        {
            String family = reader.readLine();
            if ( family.isEmpty() )
            {
                break;
            }

            addresses.add( family );
        }

        //read home number
        int houseNumber = Integer.parseInt( reader.readLine() );

        if ( 0 <= houseNumber && houseNumber < addresses.size() )
        {
            String familySecondName = addresses.get( houseNumber );
            System.out.println( familySecondName );
        }
    }
}
