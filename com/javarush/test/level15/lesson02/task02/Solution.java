package com.javarush.test.level15.lesson02.task02;

/**
 * JavaRush.ru
 * Level 15, Lesson 02, Task 02
 * <p/>
 * 1. Создать public static класс Goose(Гусь). <b/>
 * 2. Создать public static класс Dragon(Дракон). <b/>
 * 3. Унаследовать класс Goose от BigAnimal или SmallAnimal, подумать, какой логически больше подходит. <b/>
 * 4. Унаследовать класс Dragon от BigAnimal или SmallAnimal, подумать, какой логически больше подходит. <b/>
 * 5. В классах Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной. <b/>
 * 6. В классе Goose метод getSize должен возвращать строку "Гусь маленький, " + [getSize родительского класса]. <b/>
 * 7. В классе Dragon метод getSize должен возвращать строку "Дракон большой, " + [getSize родительского класса]. <b/>
 * <p/>
 * Date: 04.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    //добавьте классы Goose и Dragon тут
    public static class Goose extends SmallAnimal
    {
        @Override
        public String getSize()
        {
            return "Гусь маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal
    {
        @Override
        public String getSize()
        {
            return "Дракон большой, " + super.getSize();
        }
    }

    public static class BigAnimal
    {
        protected String getSize()
        {
            return "как динозавр";
        }
    }

    public static class SmallAnimal
    {
        String getSize()
        {
            return "как кошка";
        }
    }
}
