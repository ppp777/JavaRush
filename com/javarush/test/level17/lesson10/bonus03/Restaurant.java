package com.javarush.test.level17.lesson10.bonus03;

/**
 * JavaRush.ru <br/>
 * Level 17, Lesson 10, Bonus 03
 * <p/>
 * Ресторан. <br/>
 * 1.Разберись, что делает программа. Официант почему-то не относит приготовленные блюда назад к столам :( <br/>
 * 2.Исправь ошибку. <br/>
 * Подсказка: это одна строчка.
 * <p/>
 * Date: 11.08.13
 * @author Sergey Kandalintsev
 */
public class Restaurant
{
    public static void main( String[] args ) throws Exception
    {
        Waiter waiterTarget = new Waiter();
        Thread waiter = new Thread( waiterTarget );

        Cook cookTarget = new Cook();
        Thread cook = new Thread( cookTarget );

        waiter.start();
        cook.start();

        Thread.sleep( 2000 );
        waiterTarget.continueWorking = false;
        cookTarget.continueWorking = false;
    }
}
