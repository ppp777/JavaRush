/**
 *
 *JavaRush.ru
 *Level 05, Lesson 12, home 05
 *
 * Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
 * Вывести на экран полученную сумму
 *
 * Date: 25.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level05.lesson12.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for (String s = br.readLine(); !s.equals("сумма"); s = br.readLine()) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}
