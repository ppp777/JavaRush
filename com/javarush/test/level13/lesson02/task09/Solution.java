package com.javarush.test.level13.lesson02.task09;

/**
 * JavaRush.ru
 * Level 13, Lesson 02, Task 09
 * <p/>
 * 1. Создать интерфейс Movable с методом speed.<b/>
 * 2. Метод speed возвращает значение типа Double и не принимает параметров.<b/>
 * 3. Создать и унаследовать интерфейс Runable от интерфейса Movable.<b/>
 * 4. Добавить в интерфейс Runable метод speed.<b/>
 * 5. Метод speed возвращает значение типа Double и принимает один параметр типа Runable.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
    }

    interface Movable
    {
        Double speed();
    }

    interface Runable extends Movable
    {
        Double speed( Runable r );
    }
}
