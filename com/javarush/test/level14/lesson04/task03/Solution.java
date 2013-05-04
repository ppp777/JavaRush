package com.javarush.test.level14.lesson04.task03;

/**
 * JavaRush.ru
 * Level 14, Lesson 04, Task 03
 * <p/>
 * 1. Реализовать интерфейс Selectable в классе Food.<b/>
 * 2. Метод onSelect() должен писать в консоль "food is selected".<b/>
 * 3. Подумайте, какие методы можно вызвать для переменной food и какие для selectable. <b/>
 * 4. В методе foodMethods вызовите методы onSelect, eat, если это возможно. <b/>
 * 5. В методе selectableMethods вызовите методы onSelect, eat, если это возможно.
 * <p/>
 * Date: 30.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main(String[] args)
    {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food)
    {
        if ( food instanceof Food)
        {
            food.onSelect();
            food.eat();
            return;
        }
        if ( food instanceof Selectable )
        {
            food.onSelect();
        }
    }

    public static void selectableMethods(Selectable selectable)
    {
        selectable.onSelect();
    }

    interface Selectable
    {
        void onSelect();
    }

    static class Food implements Selectable
    {
        public void eat()
        {
            System.out.println("food is eaten");
        }

        public void onSelect()
        {
            System.out.println( "food is selected" );
        }
    }
}
