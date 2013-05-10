package com.javarush.test.level09.lesson11.home07;

/**
* JavaRush.ru
* Level 09, Lesson 11, Home 07
* <p/>
* Расставь модификаторы static так, чтобы пример скомпилировался.
* <p/>
* Date: 18.04.13
* @author Sergey Kandalintsev
*/
public class Solution
{
    public static int A = 5;
    public static int B = 2 * A;
    public static int C = A * B;
    public static int D = A * B;

    public static void main( String[] args )
    {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA()
    {
        return A;
    }
}

//Исходный вариант:
//public class Solution
//{
//    public int A = 5;
//    public int B = 2 * A;
//    public int C = A * B;
//    public int D = A * B;
//
//    public void main( String[] args )
//    {
//        test.Solution room = new test.Solution();
//        room.A = 5;
//
//        test.Solution.D = 5;
//    }
//
//    public int getA()
//    {
//        return A;
//    }
//}
