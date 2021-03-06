package com.javarush.test.level17.lesson04.task02;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru <br/>
 * Level 17, Lesson 04, Task 02
 * <p/>
 * Синхронизированные заметки 2. <br/>
 * Класс Note будет использоваться нитями. Поэтому сделай так, чтобы вcе методы были синхронизированы <br/>
 * <p/>
 * Date: 10.08.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static class Note
    {
        public final List<String> notes = new ArrayList<String>();

        public void addNote( int index, String note )
        {
            System.out.println( "Сейчас будет добавлена заметка [" + note + "] На позицию " + index );
            notes.add( index, note );
            System.out.println( "Уже добавлена заметка [" + note + "]" );
        }

        public void removeNote( int index )
        {
            System.out.println( "Сейчас будет удалена заметка с позиции " + index );
            String note = notes.remove( index );
            System.out.println( "Уже удалена заметка [" + note + "] с позиции " + index );
        }
    }
}
