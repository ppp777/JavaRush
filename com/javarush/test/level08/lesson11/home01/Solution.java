package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Set;

/**
 * JavaRush.ru
 * Level 08, Lesson 11, Home 01
 * <p/>
 * Написать класс кот - Cat. Создать множество (Set) котов. Создать три кота и добавить их в это множество. Удалить
 * одного кота из Set. Вывести на экран всех котов, которые остались во множестве.
 * <p/>
 * Date: 07.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Set<Cat> cats = createCats();

        //Написать тут ваш код

        printCats( cats );
    }

    public static Set<Cat> createCats()
    {
        //Написать тут ваш код
        return null;
    }

    public static void printCats( Set<Cat> cats )
    {
        for ( Cat cat : cats )
        {
            System.out.println( cat );
        }
    }

    public static class Cat
    {

    }
}
