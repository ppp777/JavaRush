package com.javarush.test.level15.lesson12.home06;

/**
 * JavaRush.ru
 * Level 15, Lesson 12, Home 06
 * <p/>
 * Разобраться, что в какой последовательности инициализируется. Исправить порядок инициализации данных так, чтобы
 * результат был следующим: <b/>
 * static void init(); <b/>
 * Static block; <b/>
 * public static void main; <b/>
 * non-static block; <b/>
 * static void printAllFields; <b/>
 * 0; <b/>
 * null; <b/>
 * Solution constructor; <b/>
 * static void printAllFields; <b/>
 * 6; <b/>
 * First name.
 * <p/>
 * Date: 09.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    static
    {
        init();
    }

    static
    {
        System.out.println( "Static block" );
    }

    {
        System.out.println( "non-static block" );
        printAllFields( this );
    }

    public int i = 6;

    public String name = "First name";

    public Solution()
    {
        System.out.println( "test.Solution constructor" );
        printAllFields( this );
    }

    public static void init()
    {
        System.out.println( "static void init()" );
    }

    public static void main( String[] args )
    {
        System.out.println( "public static void main" );
        Solution s = new Solution();
    }

    public static void printAllFields( Solution obj )
    {
        System.out.println( "static void printAllFields" );
        System.out.println( obj.i );
        System.out.println( obj.name );
    }
}
