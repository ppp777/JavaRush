package com.javarush.test.level04.lesson02.task03;

/**
 * JavaRush.ru
 * Level 04, Lesson 02, Task 03
 * <br>
 * Вывести на экран десять раз надпись "Я не хочу изучать Java, я хочу большую зарплату".
 * <br>
 * Date: 01.06.13
 * @author Sergey Kandalintsev
 */
public class Cat
{
    private static int catsCount = 0;

    public static void setCatsCount( int catsCount )
    {
        Cat.catsCount = catsCount;
    }
}
