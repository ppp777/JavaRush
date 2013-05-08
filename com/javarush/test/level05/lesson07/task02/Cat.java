package com.javarush.test.level05.lesson07.task02;

/**
 * JavaRush.ru
 * Level 05, Lesson 07, task 02
 * <p/>
 * Создать класс Cat (кот) с пятью инициализаторами: <b/>
 * - Имя, <b/>
 * - Имя, вес, возраст <b/>
 * - Имя, возраст (вес стандартный) <b/>
 * - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот) <b/>
 * - вес, цвет, адрес ( чужой домашний кот) <b/>
 * Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь
 * средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null).
 * То же касается адреса: null.
 * <p/>
 * Date: 23.01.13
 * @author Sergey Kandalintsev
 */
public class Cat
{
    private String name;
    private int age;
    private String address;
    private String color;
    private int weight;

    public void initialize( String name )
    {
        this.name = name;
        this.age = 2;
        this.weight = 3;
    }

    public void initialize( String name, int weight, int age )
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize( String name, int age )
    {
        this.name = name;
        this.age = age;
        this.weight = 3;
    }

    public void initialize( int weight, String color )
    {
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public void initialize( int weight, String color, String address )
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }
}
