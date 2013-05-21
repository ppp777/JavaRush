package com.javarush.test.level06.lesson08.task03;

/**
 *JavaRush.ru
 *Level 06, Lesson 08, Task 03
 *
 * Сделать класс Util, с единственным статическим методом double getDistance(x1, y1, x2, y2) – метод
 * должен вычислять расстояние между точками.
 *
 * Date: 26.01.13
 * @author Sergey Kandalintsev
 */
public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );
    }
}
