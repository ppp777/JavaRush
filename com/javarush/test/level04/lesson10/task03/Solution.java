package com.javarush.test.level04.lesson10.task03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *JavaRush.ru
 *Level 04, Lesson 10, Task 03
 *
 * Ввести с клавиатуры строку, и вывести её на экран 15 раз
 *
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = 0;
        while (i++ < 15)
            System.out.println(s);
    }
}
