package com.javarush.test.level04.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *JavaRush.ru
 *Level 04, Lesson 06, Task 01
 * Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
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
        int nFirstNumber = Integer.parseInt(sFirstNumber);
        int nSecondNumber = Integer.parseInt(sSecondNumber);
        
        System.out.println(min(nFirstNumber, nSecondNumber));
    }
    
    public static int min(int a, int b) 
    {
        return a < b ? a : b;
    }
}
