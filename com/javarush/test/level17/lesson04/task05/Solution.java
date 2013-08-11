package com.javarush.test.level17.lesson04.task05;

/**
 * JavaRush.ru <br/>
 * Level 17, Lesson 04, Task 05
 * <p/>
 * МВФ <br/>
 * Singleton паттерн - синхронизация в методе. <br/>
 * IMF - это Международный Валютный Фонд. Внутри метода getFund создайте синхронизированный блок. Внутри
 * синхронизированного блока инициализируйте переменную imf так, чтобы метод getFund всегда возвращал один и
 * тот же объект.
 * <p/>
 * Date: 11.08.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static class IMF
    {

        private static IMF imf;

        public static IMF getFund()
        {
            //add your code here - добавь код тут
            return imf;
        }

        private IMF()
        {
        }
    }
}
