package com.javarush.test.level16.lesson05.task02;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 16, Lesson 05, Task 02
 * <p/>
 * Horse Racing
 * Разберись, что делает программа
 * Реализуй метод calculateHorsesFinished. Он должен:
 * 1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
 * 2. Если лошадь еще не пришла к финишу (!isFinished()), то:
 * 2.1 Вывести в консоль "Waiting for " + horse.getName();
 * 2.2 Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого;
 * <p/>
 * Date: 09.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static int countHorses = 10;

    public static void main( String[] args ) throws InterruptedException
    {
        List<Horse> horses = prepareHorsesAndStart();
        while ( calculateHorsesFinished( horses ) != countHorses )
        {
        }
    }

    public static int calculateHorsesFinished( List<Horse> horses ) throws InterruptedException
    {
        int countFinished = 0;

        for ( Horse nextHorse : horses )
        {
            if ( nextHorse.isFinished() )
            {
                ++countFinished;
            }
            else
            {
                System.out.println( "Waiting for " + nextHorse.getName() );
                nextHorse.join();
            }
        }
        return countFinished;
    }

    public static class Horse extends Thread
    {

        public Horse( String name )
        {
            super( name );
        }

        private boolean isFinished;

        public boolean isFinished()
        {
            return isFinished;
        }

        public void run()
        {
            String s = "";
            for ( int i = 0; i < 1001; i++ )
            {   //delay
                s += new String( "" + i );
                if ( i == 1000 )
                {
                    s = " is finished!";
                    System.out.println( getName() + s );
                    isFinished = true;
                }
            }
        }
    }

    public static List<Horse> prepareHorsesAndStart()
    {
        List<Horse> horses = new ArrayList<Horse>( countHorses );
        String number;
        for ( int i = 1; i < countHorses + 1; i++ )
        {
            number = i < 10 ? ( "0" + i ) : "" + i;
            horses.add( new Horse( "Horse_" + number ) );
        }

        for ( int i = 0; i < countHorses; i++ )
        {
            horses.get( i ).start();
        }
        return horses;
    }
}
