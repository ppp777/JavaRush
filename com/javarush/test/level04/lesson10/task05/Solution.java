package com.javarush.test.level04.lesson10.task05;

/**
 *JavaRush.ru
 *Level 04, Lesson 10, Task 05
 *
 * Вывести на экран таблицу умножения 10х10
 *
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.print(i * j + " ");
            System.out.println();
        }
// Вариант с while:
//        int i = 1, j;
//        while (i <= 10) {
//            j = 1;
//            while (j <= 10) {
//                System.out.print(i * j + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
    }
}
