package com.javarush.test.level04.lesson16.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *JavaRush.ru
 *Level 04, Lesson 16, Home 04
 *
 * Ввести с клавиатуры строку name. Ввести с клавиатуры дату рождения (три числа) y, m, d.
 * Вывести на экран текст:
 * "Меня зовут name
 * Я родился d.m.y"
 * Пример:
 * Меня зовут Вася
 * Я родился 15.2.1988
 *
 * Date: 22.01.13
 * @author Sergey Kandalintsev
 */

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int year = Integer.parseInt(br.readLine());
        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + day + "." + month + "." + year);
    }
}


// Первоначальный вариант задачи:

///**
// *JavaRush.ru
// *Level 04, Lesson 16, Home 04
// *
// * Ввести с клавиатуры строку name. Ввести с клавиатуры дату рождения (три числа) y, m, d.
// * Вывести на экран текст:
// * "Меня зовут name мне ? год."
// * Я родился(ась) d.m.y"
// * Пример:
// * Меня зовут Вася
// * Мне 21 год.
// * Я родился 15.02.1988
// *
// * Date: 22.01.13
// * @author Sergey Kandalintsev
// */
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String name = br.readLine();
//        int nYear = Integer.parseInt(br.readLine());
//        int nMonth = Integer.parseInt(br.readLine());
//        int nDay = Integer.parseInt(br.readLine());
//        long age;
//        GregorianCalendar curTime = new GregorianCalendar();
//        GregorianCalendar birthTime = new GregorianCalendar(nYear, nMonth - 1, nDay);
//        age = (curTime.getTimeInMillis() - birthTime.getTimeInMillis()) / 1000 / 3600 / 24 / 365;
//        System.out.println("Меня зовут " + name);
//        System.out.println("Мне " + age +" год.");
//        System.out.println("Я родился " + formatter.format(birthTime.getTime()));
//    }
//}