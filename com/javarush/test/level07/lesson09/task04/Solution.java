/**
 *JavaRush.ru
 *Level 07, Lesson 09, task 04
 * <p/>
 * Создай список из слов «мама», «мыла», «раму». Удали все слова содержащие букву «р» и удвой все слова
 * содержащие букву «л».
 * <p/>
 * Date: 31.01.13
 * @author Sergey Kandalintsev
 */

package com.javarush.test.level07.lesson09.task04;

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();

        Collections.addAll( list, "мама", "мыла", "раму" );
        for ( int i = 0; i < list.size(); )
        {
            if ( list.get( i ).contains( "р" ) )
            {
                list.remove( i );
                continue;
            }
            i++;
        }

        for ( int i = 0; i < list.size(); i++ )
        {
            if ( list.get( i ).contains( "л" ) )
            {
                list.add( i, list.get( i ) );
                i++;
            }
        }

        for ( String s : list )
        {
            System.out.println( s );
        }
    }
}
