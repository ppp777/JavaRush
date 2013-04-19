package com.javarush.test.level10.lesson11.home04;

/**
 * JavaRush.ru
 * Level 10, Lesson 11, Home 04
 * <p/>
 * Вывести на экран надпись "Я не хочу изучать Java, я хочу большую зарплату" 40 раз по образцу: <b/>
 * Я не хочу изучать Java, я хочу большую зарплату <b/>
 *  не хочу изучать Java, я хочу большую зарплату <b/>
 * не хочу изучать Java, я хочу большую зарплату <b/>
 * е хочу изучать Java, я хочу большую зарплату <b/>
 *  хочу изучать Java, я хочу большую зарплату <b/>
 * хочу изучать Java, я хочу большую зарплату <b/>
 * ...
 * <p/>
 * Date: 19.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        for ( int i = 0; i < 40; i++ )
        {
            System.out.println( s.substring( i ) );
        }
    }
}
