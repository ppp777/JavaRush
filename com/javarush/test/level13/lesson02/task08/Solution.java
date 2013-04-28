package com.javarush.test.level13.lesson02.task08;

/**
 * JavaRush.ru
 * Level 13, Lesson 02, Task 08
 * <p/>
 * 1. Создать интерфейс Person.
 * 2. Добавьте в него метод isAlive(), который проверяет, жив человек или нет.<b/>
 * 3. Подумайте, какой тип должен возвращать этот метод.<b/>
 * 4. Создайте интерфейс Presidentable<b/>
 * 5. Унаследовать интерфейс Presidentable от интерфейса Person.
 * <p/>
 * Date: 28.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
    }

    interface Person
    {
        boolean isAlive();
    }

    interface Presidentable extends Person
    {
    }
}
