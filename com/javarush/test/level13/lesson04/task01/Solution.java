package com.javarush.test.level13.lesson04.task01;

/**
 * JavaRush.ru
 * Level 13, Lesson 04, Task 01
 * <p/>
 * 1. Создать класс EnglishTranslator, который наследуется от Translator.<b/>
 * 2. Реализовать все абстрактные методы<b/>
 * 3. Подумайте, что должен возвращать метод getLanguage.<b/>
 * 4. Программа должна выводить на экран "Я переводчик с английского"<b/>
 * 5. Метод main менять нельзя.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println( englishTranslator.translate() );
    }

    public static abstract class Translator
    {
        public abstract String getLanguage();

        public String translate()
        {
            return "Я переводчик с " + getLanguage();
        }
    }

    public static class EnglishTranslator extends Translator
    {
        public String getLanguage()
        {
            return "английского";
        }
    }
}
