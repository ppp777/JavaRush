package com.javarush.test.level03.lesson12.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int amount = Integer.parseInt( reader.readLine() );

        System.out.println( "Я буду зарабатывать $" + amount + " в час" );
    }
}