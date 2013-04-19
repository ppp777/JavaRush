package com.javarush.test.level09.lesson11.bonus02;

import java.io.*;

/**
 * JavaRush.ru
 * Level 09, Lesson 11, Bonus 02
 * <p/>
 * Нужно добавить в программу новую функциональность.<b/>
 * Задача: <b/>
 * Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем. <b/>
 * Новая задача: <b/>
 * Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем. Если файла (который нужно
 * копировать) с указанным именем не существует, программа должна вывести надпись "Файл не существует." и еще раз
 * прочитать имя файла с консоли. <b/>
 * <p/>
 * Date: 19.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String sourceFileName;
        String destinationFileName;
        FileInputStream fileInputStream;

        while ( true )
        {
            sourceFileName = reader.readLine();

            try
            {
                fileInputStream = new FileInputStream( sourceFileName );
                break;
            }
            catch ( FileNotFoundException e )
            {
                System.out.println( "Файл не существует." );
            }
        }

        destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream( destinationFileName );

        while ( fileInputStream.available() > 0 )
        {
            int data = fileInputStream.read();
            fileOutputStream.write( data );
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}

//Исходный вариант:
//public class Solution
//{
//    public static void main( String[] args ) throws IOException
//    {
//        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
//
//        String sourceFileName = reader.readLine();
//        String destinationFileName = reader.readLine();
//
//        FileInputStream fileInputStream = new FileInputStream( sourceFileName );
//        FileOutputStream fileOutputStream = new FileOutputStream( destinationFileName );
//
//        while ( fileInputStream.available() > 0 )
//        {
//            int data = fileInputStream.read();
//            fileOutputStream.write( data );
//        }
//
//        fileInputStream.close();
//        fileOutputStream.close();
//    }
//}