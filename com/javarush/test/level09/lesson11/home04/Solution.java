package com.javarush.test.level09.lesson11.home04;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * JavaRush.ru
 * Level 09, Lesson 11, Home 04
 * <p/>
 * Вывести на экран сегодняшнюю дату в виде "DEC 12, 2012". Воспользоваться объектом Date.
 * <p/>
 * Date: 15.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Date today = new Date();
        System.out.println(today);
    }
}
