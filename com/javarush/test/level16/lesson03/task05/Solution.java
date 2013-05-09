package com.javarush.test.level16.lesson03.task05;

import java.util.Date;

/**
 * JavaRush.ru
 * Level 16, Lesson 03, Task 05
 * <p/>
 * 1. Измените класс Violin так, чтоб он стал нитью. Используйте интерфейс MusicalInstrument.
 * 2. Реализуйте необходимый метод в нити Violin. Реализация должна быть следующей:
 * 2.1 Считайте время начала игры - метод startPlaying();
 * 2.2 Подождите 1 секунду - метод sleepNSeconds(int n), где n - количество секунд; <b/>
 * 2.3 Считайте время окончания игры - метод stopPlaying(). <b/>
 * 2.4 Выведите на консоль продолжительность игры в миллисекундах. Пример "Playing 1002 ms".
 * <p/>
 * Date: 09.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Violin violin = new Violin( "Player" );
        Thread thread = new Thread( violin );
        thread.start();
    }

    public static class Violin implements MusicalInstrument
    {
        private String owner;

        public Violin( String owner )
        {
            this.owner = owner;
        }

        @Override
        public Date startPlaying()
        {
            System.out.println( this.owner + " starts playing" );
            return new Date();
        }

        @Override
        public Date stopPlaying()
        {
            System.out.println( this.owner + " stops playing" );
            return new Date();
        }

        @Override
        public void run()
        {
            Date start = startPlaying();
            sleepNSeconds( 1 );
            Date stop = stopPlaying();
            System.out.println( "Playing " + ( stop.getTime() - start.getTime() ) + " ms" );
        }
    }

    public static int delay = 1000;

    public static void sleepNSeconds( int n )
    {
        try
        {
            Thread.sleep( n * delay );
        }
        catch ( InterruptedException e )
        {
            e.printStackTrace();
        }
    }

    public static interface MusicalInstrument extends Runnable
    {
        Date startPlaying();

        Date stopPlaying();
    }
}
