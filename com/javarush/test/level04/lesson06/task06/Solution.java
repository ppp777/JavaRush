package com.javarush.test.level04.lesson06.task06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *JavaRush.ru
 *Level 04, Lesson 06, Task 06
 *
 * Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
 *
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        if (nAge > 20)
            System.out.println("И 18-ти достаточно");
    }
}
