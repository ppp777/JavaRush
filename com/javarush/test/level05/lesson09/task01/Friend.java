/**
 *JavaRush.ru
 *Level 05, Lesson 09, Task 01
 *
 * Создать класс Friend (друг) с тремя конструкторами:
 * - Имя
 * - Имя, возраст
 * - Имя, возраст, пол
 *
 * Date: 24.01.13
 * @author Sergey Kandalintsev
 */

package com.javarush.test.level05.lesson09.task01;

public class Friend
{
    private String name;
    private int age;
    private String gender;

    private Friend(String name) {
        this.name = name;
    }

    private Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Friend(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
