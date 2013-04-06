package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;

/**
 * JavaRush.ru
 * Level 08, Lesson 08, Task 02
 * <p/>
 * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 * <p/>
 * Date: 06.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();

        for ( int i = 0; i < 20; i++ )
        {
            set.add( i );
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThen10( HashSet<Integer> set )
    {
        Iterator<Integer> iterator = set.iterator();

        while ( iterator.hasNext() )
        {
            if ( iterator.next() > 10 )
            {
                iterator.remove();
            }
        }

        return set;
    }
}

