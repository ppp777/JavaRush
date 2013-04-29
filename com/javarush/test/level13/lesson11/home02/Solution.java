package com.javarush.test.level13.lesson11.home02;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Home 02
 * <p/>
 * 1. В классе Today реализовать интерфейс Weather.<b/>
 * 2. Подумайте, как связан параметр String type с методом getWeatherType().<b/>
 * 3. Интерфейсы Weather и WeatherType уже реализованы.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        System.out.println( new Today( WeatherType.CLOUDY ) );
        System.out.println( new Today( WeatherType.FOGGY ) );
        System.out.println( new Today( WeatherType.FROZEN ) );
    }

    static class Today implements Weather
    {
        private String type;

        Today( String type )
        {
            this.type = type;
        }

        public String getWeatherType()
        {
            return type;
        }

        @Override
        public String toString()
        {
            return String.format( "%s for today", this.getWeatherType() );
        }
    }
}
