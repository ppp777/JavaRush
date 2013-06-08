package com.javarush.test.level13.lesson11.home04;

import java.io.*;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Home 04
 * <p/>
 * 1. Прочесть с консоли имя файла.<p/>
 * 2. Считывать строки с консоли, пока пользователь не введет строку "exit".<p/>
 * 3. Вывести все строки в файл.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        try
        {
            BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
            BufferedWriter writer =
                    new BufferedWriter( new OutputStreamWriter( new FileOutputStream( reader.readLine() ) ) );

            String nextString;

            do
            {
                nextString = reader.readLine();
                writer.write( nextString );

                if ( !nextString.equals( "exit" ) )
                {
                    writer.newLine();
                }
            }
            while ( !nextString.equals( "exit" ) );

            reader.close();
            writer.close();
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
    }
}


