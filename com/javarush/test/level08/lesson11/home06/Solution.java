package com.javarush.test.level08.lesson11.home06;

/**
 * JavaRush.ru
 * Level 08, Lesson 11, Home 06
 * <p/>
 * Создай класс Human с полями имя (String), пол (boolean), возраст, (int), дети (ArrayList<Human>). Создай объекты
 * и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
 * <p/>
 * Date: 08.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        //Написать тут ваш код
    }

    public static class Human
    {
        //Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + ( this.sex ? "мужской" : "женский" );
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if ( childCount > 0 )
            {
                text += ", дети: " + this.children.get( 0 ).name;

                for ( int i = 1; i < childCount; i++ )
                {
                    Human child = this.children.get( i );
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
