package com.javarush.test.level09.lesson11.home02;

/**
 * JavaRush.ru
 * Level 09, Lesson 11, Home 02
 * <p/>
 * Написать в цикле обратный отсчет от 10 до 0. Для задержки использовать Thread.sleep(1000);
 * Обернуть вызов sleep в try..catch.
 * <p/>
 * Date: 15.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        for ( int i = 10; i >= 0; i-- )
        {
            System.out.println( i );
            try
            {
                Thread.sleep( 1000 );
            }
            catch ( InterruptedException e )
            {
                System.out.println( e );

            }
        }
    }
}
