package com.javarush.test.level15.lesson09.task05;

/**
 * JavaRush.ru
 * Level 15, Lesson 09, Task 03
 * <p/>
 * Внутри статического блока: <b/>
 * 1. создайте класс Cat <b/>
 * 2. Внутри Cat создайте поле класса String name = "Пушок" <b/>
 * 3. создайте объект класса Cat <b/>
 * 4. присвойте статическому объекту Object cat созданный вами <b/>
 * 5. Выведите в консоль myCat.name
 * <p/>
 * Date: 07.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static Object cat;

    static
    {
        class Cat
        {
            String name = "Пушок";
        }
        Cat myCat = new Cat();
        cat = myCat;
        System.out.println( myCat.name );
    }
}
