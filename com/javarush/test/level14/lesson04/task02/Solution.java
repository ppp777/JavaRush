package com.javarush.test.level14.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 14, Lesson 04, Task 02
 * <p/>
 * 1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).<b/>
 * 2. Каждый параметр соответствует имени кота. Для каждого параметра:<b/>
 * 3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр). <b/>
 * 4. Вывести на экран cat.toString()
 * <p/>
 * Date: 30.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        for ( String catName = reader.readLine(); !catName.equals( "" ); catName = reader.readLine() )
        {
            Cat cat = CatFactory.getCatByKey( catName );
            System.out.println( cat.toString() );
        }
    }

    static class CatFactory
    {
        static Cat getCatByKey( String key )
        {
            Cat cat = null;
            if ( "vaska".equals( key ) )
            {
                cat = new MaleCat( "Василий" );
            }
            else if ( "murka".equals( key ) )
            {
                cat = new FemaleCat( "Мурочка" );
            }
            else if ( "kiska".equals( key ) )
            {
                cat = new FemaleCat( "Кисюлька" );
            }
            else
            {
                cat = new Cat( key );
            }

            return cat;
        }
    }

    static class Cat
    {
        private String name;

        protected Cat( String name )
        {
            this.name = name;
        }

        public String getName()
        {
            return this.name;
        }

        public String toString()
        {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat
    {
        MaleCat( String name )
        {
            super( name );
        }

        public String toString()
        {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat
    {
        FemaleCat( String name )
        {
            super( name );
        }

        public String toString()
        {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}