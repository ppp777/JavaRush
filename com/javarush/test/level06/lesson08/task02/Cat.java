package com.javarush.test.level06.lesson08.task02;

/**
 * JavaRush.ru
 * Level 06, Lesson 08, Task 02
 * <p/>
 * Добавить  к классу Cat, два статических метода: int getCatCount(), и setCatCount(int), с помощью
 * которых можно получить/изменить количество котов (переменную catCount).
 * <p/>
 * Date: 26.01.13
 * @author Sergey Kandalintsev
 */
public class Cat
{
    private static int catCount = 0;

    public Cat()
    {
        catCount++;
    }

    public static int getCatCount()
    {
        return catCount;
    }

    public static void setCatCount( int catCount )
    {
        Cat.catCount = catCount;
    }
}

