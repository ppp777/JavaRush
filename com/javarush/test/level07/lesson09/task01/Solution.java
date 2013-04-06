/**
 *
 *JavaRush.ru
 *Level 07, Lesson 09, task 01
 *
 * Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём массивам:
 *  Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
 *  Выведи эти три массива на экран (числа, которые делятся на 3 и на 2, например 6, попадают только в первый массив).
 *
 * Date: 30.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson09.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static final int N = 20;

    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> multipleOf3 = new ArrayList<Integer>();
        ArrayList<Integer> others = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        for (int i = 0; i < N; i++)
        {
            list.add( Integer.parseInt(br.readLine()) );
        }

        for (Integer x : list)
        {
            if (x % 3 == 0)
            {
                multipleOf3.add(x);
            }
            else if (x % 2 == 0)
            {
                even.add(x);
            }
            else
            {
                others.add(x);
            }
        }

        for (Integer x : multipleOf3)
        {
            System.out.println(x);
        }

        System.out.println();

        for (Integer x : even)
        {
            System.out.println(x);
        }

        System.out.println();

        for (Integer x : others)
        {
            System.out.println(x);
        }
    }
}
