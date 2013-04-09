package com.javarush.test.level09.lesson08.task01;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.HashMap;

/**
 * JavaRush.ru
 * Level 09, Lesson 08, Task 01
 * <p/>
 * Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
 * <p/>
 * Date: 09.04.13
 * @author Sergey Kandalintsev
 */

public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        //Напишите тут ваш код

        method1();

        //Напишите тут ваш код

    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException
    {
        int i = ( int ) ( Math.random() * 4 );
        if ( i == 0 )
        {
            throw new NullPointerException();
        }
        if ( i == 1 )
        {
            throw new ArithmeticException();
        }
        if ( i == 2 )
        {
            throw new FileNotFoundException();
        }
        if ( i == 3 )
        {
            throw new URISyntaxException( "", "" );
        }
    }
}
