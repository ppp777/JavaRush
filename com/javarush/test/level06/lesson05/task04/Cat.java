/**
 *JavaRush.ru
 *Level 06, Lesson 05, Task 04
 *
 * В конструкторе класса Cat увеличивать счётчик котов (статическую переменную этого же класса) на 1.
 * В методе finalize (уменьшать на 1).
 *
 * Date: 26.01.13
 * @author Sergey Kandalintsev
 */

package com.javarush.test.level06.lesson05.task04;

public class Cat
{
    static int catCount;

    public Cat() {
        ++catCount;
    }

    protected void finalize() {
        --catCount;
    }
}
