package com.javarush.test.level10.lesson11.home07;

/**
 * JavaRush.ru
 * Level 10, Lesson 11, Home 07
 * <p/>
 * Расставь модификаторы static так, чтобы пример скомпилировался.
 * <p/>
 * Date: 24.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main( String[] args )
    {
        Solution solution = new Solution();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution.D = 5 * D * C;

        Solution.D = 5;
    }

    public int getA()
    {
        return A;
    }

}

//Исходный вариант:
//public class test.Solution
//{
//    public int A = 5;
//    public int B = 5;
//    public int C = 5;
//    public static int D = 5;
//
//    public static void main( String[] args )
//    {
//        test.Solution solution = new test.Solution();
//        solution.A = 5;
//        solution.B = 5 * B;
//        solution.C = 5 * C * D;
//        test.Solution.D = 5 * D * C;
//
//        test.Solution.D = 5;
//    }
//
//    public int getA()
//    {
//        return A;
//    }
//}
