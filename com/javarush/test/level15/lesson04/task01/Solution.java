package com.javarush.test.level15.lesson04.task01;

/*
1 Программа должна выводить следующее:
Это double
Это Object
Это double
Это Integer
Это double

2 Удалите те методы print, которые мешают правильной работе программы
 */
/* Максимально простой код
Упрости код - убери все наследования классов, которые и так будут добавлены автоматически при компиляции
PS: Взаимосвязь между объектами me и zapp - Has-a (использует): http://ru.wikipedia.org/wiki/Has-a
 */

/**
 * JavaRush.ru
 * Level 15, Lesson 04, Task 01
 * <p/>
 * 1. Программа должна выводить следующее:<b/>
 * Это double <b/>
 * Это Object <b/>
 * Это double <b/>
 * Это Integer <b/>
 * Это double <b/>
 * 2. Удалите те методы print, которые мешают правильной работе программы
 * <p/>
 * Date: 06.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        print( ( short ) 1 );
        print( ( Number ) 1 );
        print( 1 );
        print( ( Integer ) 1 );
        print( ( int ) 1 );
    }

    public static void print( Integer i )
    {
        System.out.println( "Это Integer" );
    }

    public static void print( Object i )
    {
        System.out.println( "Это Object" );
    }

    public static void print( double i )
    {
        System.out.println( "Это double" );
    }

//    public static void print(Double i) {
//        System.out.println("Это double");
//    }
//
//    public static void print(float i) {
//        System.out.println("Это Double");
//    }

    //    public static void print(int i) {
//        System.out.println("Это Integer");
//    }

//    public static void print(Short i) {
//        System.out.println("Это Object");
//    }
}
