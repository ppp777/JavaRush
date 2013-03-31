/**
 *JavaRush.ru
 *Level 05, Lesson 12, home 02
 *
 * Создай классы Man и Woman. У классов должны быть поля name(String), age(int), address(String). Создай по
 * два объекта каждого класса, со всеми данными. Объекты выведи на экран. Используй конструкторы.
 *
 * Date: 25.01.13
 * @author Sergey Kandalintsev
 */

package com.javarush.test.level05.lesson12.home02;

public class Solution
{
    public static void main(String[] args)
    {
        Man alex = new Man("Aleksandr", 18, "Moscow");
        Man nick = new Man("Nickolaj", 25, "Kiev");
        Woman klava = new Woman("Klavdia", 52, "Khacapetovka");
        Woman nastia = new Woman("Anastasia", 34, "Odessa");

        System.out.println(alex);
        System.out.println(nick);
        System.out.println(klava);
        System.out.println(nastia);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
