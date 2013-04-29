package com.javarush.test.level13.lesson04.task03;

import java.awt.*;

/**
 * JavaRush.ru
 * Level 13, Lesson 04, Task 03
 * <p/>
 * 1. Унаследовать Fox от интерфейса Animal.<b/>
 * 2. Поменяйте код так, чтобы в классе Fox был только один метод - getName.<b/>
 * 3. Методы удалять нельзя!.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
    }

    public interface Animal
    {
        Color getColor();
    }

    public static abstract class Fox implements Animal
    {
        public String getName()
        {
            return "Fox";
        }
    }
}
