/**
 *
 *JavaRush.ru
 *Level 07, Lesson 06, task 02
 *
 * Создай список строк. Добавь в него 5 строчек: «101», «102», «103», «104», «105». Удали первую, среднюю и последнюю и
 * выведи на экран его содержимое и размер. (После удаления одного элемента индексы остальных меняются. Например,
 * если удалить 0-й элемент, то тот, который был 1-м станет 0-м. И т.д.)
 *
 * Date: 29.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level07.lesson06.task02;

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 1; i <= 5; i++) {
            list.add("10" + i);
        }

        list.remove(0);
        list.remove(1);
        list.remove(2);

        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
        System.out.println( list.size() );
    }
}
