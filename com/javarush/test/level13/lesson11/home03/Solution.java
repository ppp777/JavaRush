package com.javarush.test.level13.lesson11.home03;

import java.io.*;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Home 03
 * <p/>
 * 1. Считать с консоли имя файла.<b/>
 * 2. Вывести в консоль(на экран) содержимое файла.<b/>
 * 3. Не забыть закрыть файл и поток.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        InputStream inStream = new FileInputStream( br.readLine() );

        while ( inStream.available() > 0 )
        {
            System.out.print( ( char ) inStream.read() );
        }

        inStream.close();
    }
}
