/**
 *JavaRush.ru
 *Level 05, Lesson 07, task 03
 *
 * Создать класс Dog (собака) с тремя инициализаторами:
 *  - Имя
 *  - Имя, рост
 *  - Имя, рост, цвет
 *
 * Date: 23.01.13
 * @author Sergey Kandalintsev
 */

package com.javarush.test.level05.lesson07.task03;

public class Dog
{
    private String name;
    private int  height;
    private String color;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
