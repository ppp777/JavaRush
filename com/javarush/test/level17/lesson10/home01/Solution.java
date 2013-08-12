package com.javarush.test.level17.lesson10.home01;

import java.util.*;

/**
 * JavaRush.ru <br/>
 * Level 17, Lesson 10, Home 01
 * <p/>
 * Общий список. <br/>
 * <ol>
 * <li>Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).</li>
 * <li>Список Solution должен работать только с целыми числами Long.</li>
 * <li>Воспользуйтесь полем original.</li>
 * <li>Список будет использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.</li>
 * </ol>
 * <p/>
 * Date: 12.08.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    private ArrayList<Long> original = new ArrayList<Long>();
}
