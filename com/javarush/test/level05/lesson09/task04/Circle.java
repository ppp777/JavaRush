/**
 *JavaRush.ru
 *Level 05, Lesson 09, task 04
 *
 * Создать класс (Circle) круг, с тремя конструкторами:
 * - centerX, centerY, radius
 * - centerX, centerY, radius, width
 * - centerX, centerY, radius  width, color
 *
 * Date: 24.01.13
 * @author Sergey Kandalintsev
 */

package com.javarush.test.level05.lesson09.task04;

public class Circle
{
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int centerX, int centerY, int radius, int width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
