/**
 *
 *JavaRush.ru
 *Level 06, Lesson 11, bonus 02
 *
 * Нужно добавить в программу новую функциональность
 * Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два
 * объекта: кошку-дочь и кошку- маму. Вывести их на экран.
 *
 * Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Создать класс, который помог бы описать данную
 * ситуацию. Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа). Вывести их
 * на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь
 *
 * Date: 27.01.13
 * @author Sergey Kandalintsev
 *
 */

package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat catGrandpa = new Cat( reader.readLine() );
        Cat catGranny = new Cat( reader.readLine() );
        Cat catFather = new Cat(reader.readLine(), null, catGrandpa);
        Cat catMother = new Cat(reader.readLine(), catGranny, null);
        Cat catSon = new Cat(reader.readLine(), catMother, catFather);
        Cat catDaughter = new Cat(reader.readLine(), catMother, catFather);

        System.out.println(catGrandpa);
        System.out.println(catGranny);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father)
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString()
        {
            if ( (mother == null) && (father == null) )
                return "Cat name is " + name + ", no mother, no father";
            else if ( (mother == null) && (father != null) )
                return "Cat name is " + name + ", no mother, father is " + father.name;
            else if ( (mother != null) && (father == null) )
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}

// Исходная программа:
//package com.javarush.test.level06.lesson11.bonus02;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Solution
//{
//    public static void main(String[] args) throws IOException
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String motherName = reader.readLine();
//        Cat catMother = new Cat(motherName);
//
//        String daughterName = reader.readLine();
//        Cat catDaughter = new Cat(daughterName, catMother);
//
//        System.out.println(catMother);
//        System.out.println(catDaughter);
//    }
//
//    public static class Cat
//    {
//        private String name;
//        private Cat parent;
//
//        Cat(String name)
//        {
//            this.name = name;
//        }
//
//        Cat(String name, Cat parent)
//        {
//            this.name = name;
//            this.parent = parent;
//        }
//
//        @Override
//        public String toString()
//        {
//            if (parent == null)
//                return "Cat name is " + name + ", no mother ";
//            else
//                return "Cat name is " + name + ", mother is " + parent.name;
//        }
//    }
//
//}