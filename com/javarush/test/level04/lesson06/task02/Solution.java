package com.javarush.test.level04.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *JavaRush.ru
 *Level 04, Lesson 06, Task 02
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них.
 *
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sFirstNumber = reader.readLine();
        String sSecondNumber = reader.readLine();
        String sThirdNumber = reader.readLine();
        String sFourthNumber = reader.readLine();
        int nFirstNumber = Integer.parseInt(sFirstNumber);
        int nSecondNumber = Integer.parseInt(sSecondNumber);
        int nThirdNumber = Integer.parseInt(sThirdNumber);
        int nFourthNumber = Integer.parseInt(sFourthNumber);

        System.out.println(max(max(nFirstNumber, nSecondNumber),
                               max(nThirdNumber, nFourthNumber)));

    }
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
