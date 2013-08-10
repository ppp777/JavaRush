package com.javarush.test.level17.lesson04.task03;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru <br/>
 * Level 17, Lesson 04, Task 02
 * <p/>
 * Сад-огород <br/>
 * 1. Создайте метод public void addFruit(int index, String fruit) - который добавляет параметр fruit в лист fruits на
 * позицию index. <br/>
 * 2. Создайте метод public void removeFruit(int index) - который удаляет из fruits элемент с индексом index. <br/>
 * 3. Создайте метод public void addVegetable(int index, String fruit) - который добавляет параметр vegetable в лист
 * vegetables на позицию index. <br/>
 * 4. Создайте метод public void removeVegetable(int index) - который удаляет из vegetables элемент с индексом index. <br/>
 * 5. Класс Garden будет использоваться нитями. Поэтому сделай так, чтобы все методы блокировали мютекс this. <br/>
 * 6. Реализуй это минимальным количеством кода. <br/>
 * <p/>
 * Date: 10.08.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static class Garden
    {
        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();
    }
}
