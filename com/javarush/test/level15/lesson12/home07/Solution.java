package com.javarush.test.level15.lesson12.home07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 15, Lesson 12, Home 07
 * <p/>
 * 1. Инициализируй константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк. <b/>
 * 2. В статическом блоке считай из файла с именем Constants.FILE_NAME все строки и добавь их по-отдельности в
 * List lines. <b/>
 * 3. Закрой поток ввода методом close().
 * <p/>
 * Date: 09.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static List<String> lines = new ArrayList<String>();

    static
    {
        try ( BufferedReader reader =
                      new BufferedReader( new InputStreamReader( new FileInputStream( Constants.FILE_NAME ) ) ) )
        {
            while ( reader.ready() )

            {
                lines.add( reader.readLine() );
            }
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
    }

    public static void main( String[] args )
    {
        System.out.println( lines );
    }
}
