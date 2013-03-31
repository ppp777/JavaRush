package com.javarush.test.level04.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *JavaRush.ru
 *Level 04, Lesson 06, Task 03
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания.
 *
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution  
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sFirstNumber = reader.readLine();
        String sSecondNumber = reader.readLine();
        String sThirdNumber = reader.readLine();
        int nFirstNumber = Integer.parseInt(sFirstNumber);
        int nSecondNumber = Integer.parseInt(sSecondNumber);
        int nThirdNumber = Integer.parseInt(sThirdNumber);

        printNumbers(nFirstNumber, nSecondNumber, nThirdNumber);
    }
    
    public static void printNumbers(int a, int b, int c) {
        int tmp;

        if (a < b) 
        {
            tmp = a;
            a = b;
            b = tmp;
        }

        if (b < c) 
        {
            tmp = b;
            b = c;
            c = tmp;
        }

        if (a < b) 
        {
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println("" + a + " " + b + " " + c);
    }
}
