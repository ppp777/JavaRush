package com.javarush.test.level17.lesson04.task04;

/**
 * JavaRush.ru <br/>
 * Level 17, Lesson 04, Task 04
 * <p/>
 * Синхронизированный президент. <br/>
 * И снова Singleton паттерн - синхронизация в статическом блоке. <br/>
 * Внутри класса OurPresident в статическом блоке создайте синхронизированный блок. Внутри синхронизированного блока
 * инициализируйте president.
 * <p/>
 * Date: 11.08.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static class OurPresident
    {
        private static OurPresident president;

        private OurPresident()
        {
        }

        public static OurPresident getOurPresident()
        {
            return president;
        }
    }
}
