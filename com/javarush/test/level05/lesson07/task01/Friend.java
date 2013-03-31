package com.javarush.test.level05.lesson07.task01;

/**
 *JavaRush.ru
 *Level 05, Lesson 07, task 01
 *
 * Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
 * - Имя
 * - Имя, возраст
 * - Имя, возраст, пол
 *
 * Date: 23.01.13
 * @author Sergey Kandalintsev
 */

public class Friend
{
    private String name;
    private int age;
    private String gender;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
