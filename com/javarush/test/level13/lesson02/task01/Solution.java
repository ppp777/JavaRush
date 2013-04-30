package com.javarush.test.level13.lesson02.task01;

/**
 * JavaRush.ru
 * Level 13, Lesson 02, Task 01
 * <p/>
 * 1. Подумайте, какой из двух интерфейсов нужно реализовать в классе Beer <b/>
 * 2. Добавьте к классу Beer этот интерфейс и реализуйте все нереализованные методы <b/>
 * 3. Подумайте, как связаны переменная  READY_TO_GO_HOME и метод  isReadyToGoHome <b/>
 * 4. Верните значение переменной READY_TO_GO_HOME в методе isReadyToGoHome <b/>
 * <p/>
 * Date: 28.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
    }

    public interface Drink
    {
        void askMore( String message );

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink
    {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol
    {
        public void askMore( String message )
        {
        }

        public void sleepOnTheFloor()
        {
        }

        public void sayThankYou()
        {
        }

        public boolean isReadyToGoHome()
        {
            return READY_TO_GO_HOME;
        }
    }
}
