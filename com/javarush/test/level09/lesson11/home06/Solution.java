package com.javarush.test.level09.lesson11.home06;

import java.util.ArrayList;

/**
 * JavaRush.ru
 * Level 09, Lesson 11, Home 06
 * <p/>
 * Создай пять классов: красная шапочка, бабушка, пирожок, дровосек, волк. Создай необходимое количество объектов (и
 * правильно расставь связи), чтобы получились все герои сказки "Красная шапочка". Выведи объекты на экран.
 * <p/>
 * Date: 15.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main( String[] args )
    {
        // Напишите тут ваш код
    }

    //красная шапочка
    public static class LittleRedRidingHood
    {
        public ArrayList<Object> killed = new ArrayList<Object>();
        public ArrayList<Object> ate = new ArrayList<Object>();
    }

    //бабушка
    public static class Grandmother
    {
        public ArrayList<Object> killed = new ArrayList<Object>();
        public ArrayList<Object> ate = new ArrayList<Object>();
    }

    //пирожек
    public static class Patty
    {
        public ArrayList<Object> killed = new ArrayList<Object>();
        public ArrayList<Object> ate = new ArrayList<Object>();
    }

    //дровосек
    public static class Woodman
    {
        public ArrayList<Object> killed = new ArrayList<Object>();
        public ArrayList<Object> ate = new ArrayList<Object>();
    }

    //волк
    public static class Wolf
    {
        public ArrayList<Object> killed = new ArrayList<Object>();
        public ArrayList<Object> ate = new ArrayList<Object>();
    }
}
